package org.ctag.monolith.web;

import org.ctag.monolith.domain.service.DomProjectService;
import org.ctag.monolith.domain.service.DomStepService;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = TestApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseServiceTest {

    @MockBean
    protected DomStepService domStepService;

    @MockBean
    protected DomProjectService domProjectService;
}