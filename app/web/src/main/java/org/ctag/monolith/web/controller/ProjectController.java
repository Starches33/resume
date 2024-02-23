package org.ctag.monolith.web.controller;

import lombok.RequiredArgsConstructor;
import org.ctag.monolith.domain.model.Project;
import org.ctag.monolith.web.dto.ProjectDto;
import org.ctag.monolith.web.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

//    @Autowired
//    public ProjectController(ProjectService projectService) {
//        this.projectService = projectService;
//    }

    @GetMapping("/a")
    public String home() {
        return "Spring is!";
    }


    @GetMapping("/list")
    public ResponseEntity<List<ProjectDto>> getAllProjects() {
        return ResponseEntity.ok(projectService.getProjectList());
    }
}
