package org.ctag.monolith.web.controller;

import lombok.RequiredArgsConstructor;
import org.ctag.monolith.web.dto.ProjectDto;
import org.ctag.monolith.web.dto.StepDto;
import org.ctag.monolith.web.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/steps")
public class StepController {

    private final StepService stepService;

//    @Autowired
//    public StepController(StepService stepService) {
//        this.stepService = stepService;
//    }

    @GetMapping("/a")
    public String home() {
        return "Spring is!";
    }


    @GetMapping("/list")
    public ResponseEntity<List<StepDto>> getAllProjects() {
        return ResponseEntity.ok(stepService.getStepList());
    }
}
