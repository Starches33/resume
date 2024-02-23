package org.ctag.monolith.domain.mapper;

import org.ctag.monolith.domain.entity.StepEO;
import org.ctag.monolith.domain.model.Step;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomStepMapper {

    Step toDto(StepEO stepEO);
}
