package org.ctag.monolith.domain.service;

import org.ctag.monolith.domain.BaseServiceTest;
import org.ctag.monolith.domain.entity.ProjectEO;
import org.ctag.monolith.domain.mapper.DomProjectMapper;
import org.ctag.monolith.domain.model.Project;
import org.ctag.monolith.domain.repository.ProjectRepository;
import org.ctag.monolith.domain.service.impl.DomProjectServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

public class DomProjectServiceTest extends BaseServiceTest {

    private DomProjectService projectService;

    private ProjectRepository projectRepository;

    private DomProjectMapper domProjectMapper;

    @BeforeEach
    void setUp() {
        projectRepository = mock(ProjectRepository.class);
        domProjectMapper = mock(DomProjectMapper.class);
        projectService = new DomProjectServiceImpl(projectRepository, domProjectMapper);
    }

    @Test
    void getEmptyStepList() {
        when(projectRepository.findAll()).thenReturn(Collections.emptyList());

        assertTrue(projectService.getProjectList().isEmpty());
        verify(projectRepository).findAll();
        verifyNoInteractions(domProjectMapper);
    }

    @Test
    void getFilledStepList() {
        List<ProjectEO> domainSteps = Arrays.asList(new ProjectEO(), new ProjectEO(), new ProjectEO());
        when(projectRepository.findAll()).thenReturn(domainSteps);

        List<Project> result = projectService.getProjectList();

        assertFalse(result.isEmpty());
        assertEquals(domainSteps.size(), result.size());
        verify(projectRepository).findAll();
    }
}
