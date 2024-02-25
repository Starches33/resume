package org.ctag.monolith.web.mapper;

import org.ctag.monolith.domain.model.Step;
import org.ctag.monolith.web.dto.StepDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StepMapper {

    Step map(StepDto stepDto);

    StepDto map(Step step);
}
