package com.marvic.alchemists_arsenal.ingredient.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record NewIngredientDTO(
        @NotBlank
        @Size(min = 2, max = 50)
        String name,
        String description
) {
}
