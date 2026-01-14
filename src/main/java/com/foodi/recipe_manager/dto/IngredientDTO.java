package com.foodi.recipe_manager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class IngredientDTO {
    @NotBlank
    String name;
    @NotNull
    @Positive
    String quantity;
    @NotBlank
    String unit;
}

