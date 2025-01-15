package com.marvic.alchemists_arsenal.ingredient.repository;

import com.marvic.alchemists_arsenal.ingredient.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
