package com.marvic.alchemists_arsenal.dtos.pacient;

public record PacientDTO(
        String fullName,
        String gender,
        int age,
        String address,
        String phone,
        String email,
        String description,
        String allergies
) {}
