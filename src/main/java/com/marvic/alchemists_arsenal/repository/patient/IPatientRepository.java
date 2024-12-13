package com.marvic.alchemists_arsenal.repository.patient;

import com.marvic.alchemists_arsenal.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Long> {
}