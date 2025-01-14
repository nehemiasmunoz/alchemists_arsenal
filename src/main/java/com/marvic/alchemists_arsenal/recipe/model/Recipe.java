package com.marvic.alchemists_arsenal.recipe.model;


import com.marvic.alchemists_arsenal.ingredient.relations.RecipeIngredient;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String instructions;
}
