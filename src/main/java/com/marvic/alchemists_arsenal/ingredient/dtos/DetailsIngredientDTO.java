package com.marvic.alchemists_arsenal.ingredient.dtos;

import com.marvic.alchemists_arsenal.ingredient.model.Ingredient;

public record DetailsIngredientDTO(
        Long id,
        String name,
        String description
) {
    public DetailsIngredientDTO(Ingredient i) {
        this(i.getId(), i.getName(), i.getDescription());
    }
}
