package com.foodi.recipe_manager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;

@Getter
public class IngredientDTO {

    @NotBlank
    private final String name;

    @NotNull
    @Positive
    private final Double quantity;

    @NotBlank
    private final String unit;

    public IngredientDTO(String name, Double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

}

