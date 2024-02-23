//package org.ctag.monolith.web.mapper;
//
//import org.ctag.monolith.domain.model.Step;
//import org.ctag.monolith.web.BaseServiceTest;
//import org.ctag.monolith.web.dto.StepDto;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.mockito.ArgumentMatchers.any;
//
//public class StepMapperTest extends BaseServiceTest {
//
//    @Autowired
//    private StepMapper stepMapper;
//
//    @Test
//    public void stepToCarMapping() {
//        var stepDto = StepDto.builder()
//                .id(any())
//                .build();
//
//        var step = stepMapper.map(stepDto);
//
//        Assertions.assertEquals(stepDto.getId(), step.getId());
//    }
//
//    @Test
//    public void stepToCarDtoMapping() {
//        var step = Step.builder()
//                .id(any())
//                .build();
//
//        var stepDto = stepMapper.map(step);
//
//        Assertions.assertEquals(step.getId(), stepDto.getId());
//    }
//}
