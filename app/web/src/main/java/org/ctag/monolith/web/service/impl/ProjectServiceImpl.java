package org.ctag.monolith.web.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ctag.monolith.domain.service.DomProjectService;
import org.ctag.monolith.web.dto.ProjectDto;
import org.ctag.monolith.web.mapper.ProjectMapper;
import org.ctag.monolith.web.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectMapper projectMapper;

    private final DomProjectService domProjectService;

    @Override
    public List<ProjectDto> getProjectList() {
        var projectList = domProjectService.getProjectList();


        if (projectList.isEmpty()) {
            log.info("projectList пуст");

            return Collections.emptyList();
        }

        return projectList.stream()
                .map(projectMapper::map)
                .collect(Collectors.toList());
    }
}
