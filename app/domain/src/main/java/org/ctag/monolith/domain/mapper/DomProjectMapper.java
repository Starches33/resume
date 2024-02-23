package org.ctag.monolith.domain.mapper;

import org.ctag.monolith.domain.entity.ProjectEO;
import org.ctag.monolith.domain.model.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomProjectMapper {

    Project toDto(ProjectEO projectEO);
}
