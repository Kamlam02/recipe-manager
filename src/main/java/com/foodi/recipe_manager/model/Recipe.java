package com.foodi.recipe_manager.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Recipe {
    private String id;
    private String name;
    private String description;
    private int servings;
    private List<Ingredient> ingredients;
    private List<Step> steps;
    private LocalDateTime createdAt;
}
