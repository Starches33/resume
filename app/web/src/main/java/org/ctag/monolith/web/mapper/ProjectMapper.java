package org.ctag.monolith.web.mapper;

import org.ctag.monolith.domain.model.Project;
import org.ctag.monolith.web.dto.ProjectDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    Project map(ProjectDto projectDto);

    ProjectDto map(Project project);
}
