package com.marvic.alchemists_arsenal.infra.exceptions.advice.dto;

import org.springframework.validation.FieldError;

public record FieldValidationData(
        String fieldName,
        String message
) {
    public FieldValidationData(FieldError error) {
        this(error.getField(), error.getDefaultMessage());
    }
}
