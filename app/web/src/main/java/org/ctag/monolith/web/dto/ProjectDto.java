package org.ctag.monolith.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProjectDto {

    private Integer id;

    private String javaVersion;

    private String workPeriod;

    private String stack;
}
