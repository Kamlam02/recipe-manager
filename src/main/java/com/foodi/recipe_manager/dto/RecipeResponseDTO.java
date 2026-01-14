package com.foodi.recipe_manager.dto;

import com.foodi.recipe_manager.model.Ingredient;
import com.foodi.recipe_manager.model.Recipe;
import com.foodi.recipe_manager.model.Step;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class RecipeResponseDTO {

    private final String id;
    private final String name;
    private final String description;
    private final Integer servings;
    private final List<IngredientDTO> ingredients;
    private final List<StepDTO> steps;

    private RecipeResponseDTO(
            String id,
            String name,
            String description,
            Integer servings,
            List<IngredientDTO> ingredients,
            List<StepDTO> steps
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.servings = servings;
        this.ingredients = ingredients;
        this.steps = steps;
    }
    public static RecipeResponseDTO from(Recipe recipe) {
        return new RecipeResponseDTO(
                recipe.getId(),
                recipe.getName(),
                recipe.getDescription(),
                recipe.getServings(),
                mapIngredients(recipe.getIngredients()),
                mapSteps(recipe.getSteps())
        );
    }
    private static List<IngredientDTO> mapIngredients(List<Ingredient> ingredients) {
        return ingredients.stream()
                .map(i -> new IngredientDTO(
                        i.getName(),
                        i.getQuantity(),
                        i.getUnit()
                ))
                .collect(Collectors.toList());
    }
    private static List<StepDTO> mapSteps(List<Step> steps) {
        return steps.stream()
                .sorted(Comparator.comparing(Step::getStepNumber))
                .map(s -> new StepDTO(
                        s.getStepNumber(),
                        s.getInstruction()
                ))
                .collect(Collectors.toList());
    }


    // getters only
}
