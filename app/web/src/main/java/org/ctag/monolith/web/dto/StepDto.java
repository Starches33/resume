package org.ctag.monolith.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StepDto {

    private Integer id;

    private String year;

    private String title;

    private String description;
}
