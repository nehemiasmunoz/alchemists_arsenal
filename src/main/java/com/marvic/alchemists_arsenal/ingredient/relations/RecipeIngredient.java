package com.marvic.alchemists_arsenal.ingredient.relations;

import com.marvic.alchemists_arsenal.ingredient.enums.UnitOfMeasure;
import com.marvic.alchemists_arsenal.ingredient.model.Ingredient;
import com.marvic.alchemists_arsenal.recipe.model.Recipe;
import jakarta.persistence.*;


@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double quantity;
    @Embedded
    @Enumerated(EnumType.STRING)
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Recipe recipe;

    @ManyToOne
    private Ingredient ingredient;

}
