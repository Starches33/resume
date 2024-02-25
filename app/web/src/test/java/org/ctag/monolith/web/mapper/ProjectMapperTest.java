package org.ctag.monolith.web.mapper;

import org.ctag.monolith.domain.model.Project;
import org.ctag.monolith.web.BaseServiceTest;
import org.ctag.monolith.web.dto.ProjectDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectMapperTest extends BaseServiceTest {

    @Autowired
    private ProjectMapper projectMapper;

    @Test
    public void projectDtoToProjectMapping() {
        var projectDto = ProjectDto.builder()
                .id(1)
                .build();

        var project = projectMapper.map(projectDto);

        Assertions.assertEquals(projectDto.getId(), project.getId());
    }

    @Test
    public void projectToProjectDtoMapping() {
        var project = Project.builder()
                .id(1)
                .build();

        var projectDto = projectMapper.map(project);

        Assertions.assertEquals(project.getId(), projectDto.getId());
    }
}
