package com.foodi.recipe_manager.repository;

import com.foodi.recipe_manager.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository
        extends JpaRepository<Recipe, Long> {
    List<Recipe> findByNameContainingIgnoreCase(String name);
    
    List<Recipe> findByServings(Integer servings);

    List<Recipe> findByIngredientsNameIgnoreCase(String ingredientName);
}

