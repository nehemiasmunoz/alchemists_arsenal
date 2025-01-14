package com.marvic.alchemists_arsenal.category.relations;

import com.marvic.alchemists_arsenal.recipe.model.Recipe;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String name;
    @OneToMany
    private Set<Recipe> recipes;
}
