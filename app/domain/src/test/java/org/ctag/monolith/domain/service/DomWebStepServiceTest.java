//package org.ctag.monolith.domain.service;
//
//import org.ctag.monolith.domain.BaseServiceTest;
//import org.ctag.monolith.domain.entity.StepEO;
//import org.ctag.monolith.domain.mapper.DomStepMapper;
//import org.ctag.monolith.domain.model.Step;
//import org.ctag.monolith.domain.repository.StepRepository;
//import org.ctag.monolith.domain.service.impl.DomStepServiceImpl;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.verifyNoInteractions;
//import static org.mockito.Mockito.when;
//
//public class DomWebStepServiceTest extends BaseServiceTest {
//
//    private DomStepService stepService;
//
//    private StepRepository stepRepository;
//
//    private DomStepMapper domStepMapper;
//
//    @BeforeEach
//    void setUp() {
//        stepRepository = mock(StepRepository.class);
//        domStepMapper = mock(DomStepMapper.class);
//        stepService = new DomStepServiceImpl(stepRepository, domStepMapper);
//    }
//
//    @Test
//    void getEmptyStepList() {
//        when(stepRepository.findAll()).thenReturn(Collections.emptyList());
//
//        assertTrue(stepService.getStepList().isEmpty());
//        verify(stepRepository).findAll();
//        verifyNoInteractions(domStepMapper);
//    }
//
//    @Test
//    void getFilledStepList() {
//        List<StepEO> domainSteps = Arrays.asList(new StepEO(), new StepEO(), new StepEO());
//        when(stepRepository.findAll()).thenReturn(domainSteps);
//
//        List<Step> result = stepService.getStepList();
//
//        assertFalse(result.isEmpty());
//        assertEquals(domainSteps.size(), result.size());
//        verify(stepRepository).findAll();
//    }
//}
