package com.marvic.alchemists_arsenal.ingredient.restcontroller;

import com.marvic.alchemists_arsenal.ingredient.dtos.DetailsIngredientDTO;
import com.marvic.alchemists_arsenal.ingredient.dtos.NewIngredientDTO;
import com.marvic.alchemists_arsenal.ingredient.services.inter.IIngredientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("rest/ingredient")
public class IngredientController {

    private final IIngredientService ingredientService;

    IngredientController(IIngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailsIngredientDTO> getIngredientById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(ingredientService.getIngredientById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<DetailsIngredientDTO> save(@RequestBody @Valid NewIngredientDTO ingredient, UriComponentsBuilder uriBuilder) {
        DetailsIngredientDTO ingredientDTO = ingredientService.save(ingredient);
        //Enviamos ubicacion del elemento creado
        URI uri = uriBuilder.path("/rest/ingredient/{id}").buildAndExpand(ingredientDTO.id()).toUri();
        return ResponseEntity.created(uri).body(ingredientDTO);
    }
}
