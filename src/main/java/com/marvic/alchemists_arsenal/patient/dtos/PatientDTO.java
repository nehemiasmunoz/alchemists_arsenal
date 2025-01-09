package com.marvic.alchemists_arsenal.patient.dtos;

public record PatientDTO(
        String fullName,
        String gender,
        int age,
        String address,
        String phone,
        String email,
        String description,
        String allergies
) {
}
