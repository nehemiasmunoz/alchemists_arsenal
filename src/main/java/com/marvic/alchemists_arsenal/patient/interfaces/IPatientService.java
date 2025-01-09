package com.marvic.alchemists_arsenal.patient.interfaces;

import com.marvic.alchemists_arsenal.patient.dtos.PatientDTO;

import java.util.List;
import java.util.Optional;

public interface IPatientService {
    List<PatientDTO> getPacients();

    Optional<PatientDTO> getPacientById(Long id);

    PatientDTO addPacient(PatientDTO patientDTO);

    PatientDTO updatePacient(PatientDTO patientDTO);

    PatientDTO deletePacient(Long id);
}
