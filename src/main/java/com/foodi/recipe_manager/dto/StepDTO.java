package com.foodi.recipe_manager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;

@Getter
public class StepDTO {

    @NotNull
    @Positive
    private final Integer stepNumber;

    @NotBlank
    private final String instruction;

    public StepDTO(Integer stepNumber, String instruction) {
        this.stepNumber = stepNumber;
        this.instruction = instruction;
    }

}
