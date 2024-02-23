package org.ctag.monolith.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Step {

    private Integer id;

    private String year;

    private String title;

    private String description;
}
