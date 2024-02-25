package org.ctag.monolith.web.service;

import org.ctag.monolith.web.dto.StepDto;

import java.util.List;

public interface StepService {
    List<StepDto> getStepList();
}
