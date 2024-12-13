package com.marvic.alchemists_arsenal.dtos.patient;

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
