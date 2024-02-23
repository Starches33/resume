package org.ctag.monolith.domain.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ctag.monolith.domain.mapper.DomProjectMapper;
import org.ctag.monolith.domain.model.Project;
import org.ctag.monolith.domain.repository.ProjectRepository;
import org.ctag.monolith.domain.service.DomProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class DomProjectServiceImpl implements DomProjectService {

    @Autowired
    private final ProjectRepository projectRepository;

    @Autowired
    private final DomProjectMapper domProjectMapper;

    @Override
    public List<Project> getProjectList() {
        var projectList = projectRepository.findAll();


        if (projectList.isEmpty()) {
            log.info("projectList пуст");

            return Collections.emptyList();
        }

        return projectList.stream()
                .map(domProjectMapper::toDto)
                .collect(Collectors.toList());
    }
}
