package com.foodi.recipe_manager.model;

import lombok.Data;

@Data
public class Ingredient {
    private String name;
    private String quantity;
    private String unit;
}
