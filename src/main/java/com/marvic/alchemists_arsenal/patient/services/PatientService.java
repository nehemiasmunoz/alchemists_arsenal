package com.marvic.alchemists_arsenal.patient.services;

import com.marvic.alchemists_arsenal.patient.dtos.PatientDTO;
import com.marvic.alchemists_arsenal.patient.interfaces.IPatientService;
import com.marvic.alchemists_arsenal.patient.model.Patient;
import com.marvic.alchemists_arsenal.patient.repository.IPatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService implements IPatientService {
    private final IPatientRepository pacientRepository;

    PatientService(IPatientRepository repository) {
        this.pacientRepository = repository;
    }

    @Override
    public List<PatientDTO> getPacients() {
        List<PatientDTO> patientDTOS = pacientRepository.findAll().stream()
                .map(Patient::toDto)
                .toList();
        return patientDTOS;
    }

    @Override
    public Optional<PatientDTO> getPacientById(Long id) {
        return Optional.empty();
    }

    @Override
    public PatientDTO addPacient(PatientDTO patientDTO) {
        return pacientRepository.save(new Patient(patientDTO)).toDto();
    }

    @Override
    public PatientDTO updatePacient(PatientDTO patientDTO) {
        return null;
    }

    @Override
    public PatientDTO deletePacient(Long id) {
        return null;
    }
}
