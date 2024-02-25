package org.ctag.monolith.web.service;

import org.ctag.monolith.web.dto.ProjectDto;

import java.util.List;

public interface ProjectService {
    List<ProjectDto> getProjectList();
}
