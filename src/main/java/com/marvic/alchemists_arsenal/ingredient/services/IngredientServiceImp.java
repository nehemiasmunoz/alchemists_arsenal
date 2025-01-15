package com.marvic.alchemists_arsenal.ingredient.services;

import com.marvic.alchemists_arsenal.ingredient.dtos.DetailsIngredientDTO;
import com.marvic.alchemists_arsenal.ingredient.dtos.NewIngredientDTO;
import com.marvic.alchemists_arsenal.ingredient.model.Ingredient;
import com.marvic.alchemists_arsenal.ingredient.repository.IngredientRepository;
import com.marvic.alchemists_arsenal.ingredient.services.inter.IIngredientService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientServiceImp implements IIngredientService {

    private final IngredientRepository ingredientRepository;

    IngredientServiceImp(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public DetailsIngredientDTO getIngredientById(Long id) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);
        if (ingredient.isPresent()) {
            return new DetailsIngredientDTO(ingredient.get());
        } else {
            throw new NullPointerException("Ingrediente no encontrado");
        }
    }

    @Override
    @Transactional
    public DetailsIngredientDTO save(NewIngredientDTO newIngredient) {
        return new DetailsIngredientDTO(ingredientRepository.save(new Ingredient(newIngredient)));
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (ingredientRepository.existsById(id)) {
            ingredientRepository.deleteById(id);
        } else {
            throw new NullPointerException("Ingrediente no encontrado");
        }
    }
}
