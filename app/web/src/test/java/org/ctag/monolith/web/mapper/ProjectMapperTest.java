//package org.ctag.monolith.web.mapper;
//
//import org.ctag.monolith.domain.model.Project;
//import org.ctag.monolith.web.BaseServiceTest;
//import org.ctag.monolith.web.dto.ProjectDto;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.mockito.ArgumentMatchers.any;
//
//public class ProjectMapperTest extends BaseServiceTest {
//
//    @Autowired
//    private ProjectMapper projectMapperMapper;
//
//    @Test
//    public void projectToCarMapping() {
//        var projectDto = ProjectDto.builder()
//                .id(any())
//                .build();
//
//        var project = projectMapperMapper.map(projectDto);
//
//        Assertions.assertEquals(projectDto.getId(), project.getId());
//    }
//
//    @Test
//    public void projectToCarDtoMapping() {
//        var project = Project.builder()
//                .id(any())
//                .build();
//
//        var projectDto = projectMapperMapper.map(project);
//
//        Assertions.assertEquals(project.getId(), projectDto.getId());
//    }
//}
