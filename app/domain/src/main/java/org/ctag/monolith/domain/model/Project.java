package org.ctag.monolith.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Project {

    private Integer id;

    private String workPeriod;

    private String javaVersion;

    private String stack;

    private String tasks;
}
