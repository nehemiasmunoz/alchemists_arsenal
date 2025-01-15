package com.marvic.alchemists_arsenal.ingredient.services.inter;

import com.marvic.alchemists_arsenal.ingredient.dtos.DetailsIngredientDTO;
import com.marvic.alchemists_arsenal.ingredient.dtos.NewIngredientDTO;

public interface IIngredientService {

    DetailsIngredientDTO getIngredientById(Long id);

    DetailsIngredientDTO save(NewIngredientDTO newIngredient);

    void deleteById(Long id);
}
