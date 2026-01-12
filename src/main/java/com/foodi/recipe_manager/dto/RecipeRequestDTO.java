package com.foodi.recipe_manager.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import java.util.List;

@Getter
public class RecipeRequestDTO {

    @NotBlank(message = "Recipe name is required")
    private final String name;

    private final String description;

    @Min(value = 1, message = "Servings must be at least 1")
    private final Integer servings;

    @NotEmpty(message = "At least one ingredient is required")
    private final List<IngredientDTO> ingredients;

    @NotEmpty(message = "At least one step is required")
    private final List<StepDTO> steps;

    public RecipeRequestDTO(
            String name,
            String description,
            Integer servings,
            List<IngredientDTO> ingredients,
            List<StepDTO> steps
    ) {
        this.name = name;
        this.description = description;
        this.servings = servings;
        this.ingredients = ingredients;
        this.steps = steps;
    }

}
