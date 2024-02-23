//package org.ctag.monolith.web.controller;
//
//import org.ctag.monolith.domain.model.Project;
//import org.ctag.monolith.web.BaseControllerTest;
//import org.ctag.monolith.web.dto.ProjectDto;
//import org.junit.jupiter.api.Test;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.util.List;
//import java.util.UUID;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyList;
//import static org.mockito.Mockito.when;
//
//class ProjectControllerTest extends BaseControllerTest {
//    private static final String PROJECTS = ROOT_WEB + "/projects";
//
//
//    @Test
//    void getProjectList() {
//        when(projectService.getProjectList()).thenReturn(List.of(ProjectDto.builder().build()));
//
//        ResponseEntity<String> response = get(PROJECTS, String.class, Byte.valueOf("3"));
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//    }
//}