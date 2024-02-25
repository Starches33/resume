package org.ctag.monolith.web.controller;

import org.ctag.monolith.web.BaseControllerTest;
import org.ctag.monolith.web.dto.ProjectDto;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ProjectControllerTest extends BaseControllerTest {
    private static final String PROJECTS = ROOT_WEB + "/projects/list";

    @Test
    void getProjectList() throws JSONException {
        when(projectService.getProjectList())
                .thenReturn(List.of(ProjectDto.builder().build()));

        ResponseEntity<String> response = get(PROJECTS, String.class, Byte.valueOf("1"));
        assertEquals(HttpStatus.OK, response.getStatusCode());

        JSONArray jsonArray = new JSONArray(response.getBody());
        assertEquals(1, jsonArray.length());
    }
}