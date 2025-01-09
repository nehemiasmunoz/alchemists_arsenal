package com.marvic.alchemists_arsenal.patient.repository;

import com.marvic.alchemists_arsenal.patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Long> {
}