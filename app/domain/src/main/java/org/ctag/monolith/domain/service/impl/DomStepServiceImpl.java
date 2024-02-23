package org.ctag.monolith.domain.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ctag.monolith.domain.mapper.DomStepMapper;
import org.ctag.monolith.domain.model.Step;
import org.ctag.monolith.domain.repository.StepRepository;
import org.ctag.monolith.domain.service.DomStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class DomStepServiceImpl implements DomStepService {

    @Autowired
    private final StepRepository stepRepository;

    @Autowired
    private final DomStepMapper domStepMapper;

    @Override
    public List<Step> getStepList() {
        var stepList = stepRepository.findAll();

        if (stepList.isEmpty()) {
            log.info("stepList пуст");

            return Collections.emptyList();
        }

        return stepList.stream()
                .map(domStepMapper::toDto)
                .collect(Collectors.toList());
    }
}
