package org.ctag.monolith.web.service.impl;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ctag.monolith.domain.service.DomProjectService;
import org.ctag.monolith.domain.service.DomStepService;
import org.ctag.monolith.web.dto.ProjectDto;
import org.ctag.monolith.web.dto.StepDto;
import org.ctag.monolith.web.mapper.ProjectMapper;
import org.ctag.monolith.web.mapper.StepMapper;
import org.ctag.monolith.web.service.StepService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class StepServiceImpl implements StepService {

    private final StepMapper stepMapper;

    private final DomStepService domStepService;

    @Override
    public List<StepDto> getStepList() {
        var stepList = domStepService.getStepList();


        if (stepList.isEmpty()) {
            log.info("stepList пуст");

            return Collections.emptyList();
        }

        return stepList.stream()
                .map(stepMapper::map)
                .collect(Collectors.toList());
    }

}
