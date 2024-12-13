package com.marvic.alchemists_arsenal.services;

import com.marvic.alchemists_arsenal.IPacientRepository;
import com.marvic.alchemists_arsenal.dtos.pacient.PacientDTO;
import com.marvic.alchemists_arsenal.interfaces.IPacientService;
import com.marvic.alchemists_arsenal.model.pacient.Pacient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientService implements IPacientService {
    private final IPacientRepository pacientRepository;

    PacientService(IPacientRepository repository){
        this.pacientRepository = repository;
    }

    @Override
    public List<PacientDTO> getPacients() {
        List<PacientDTO> pacientDTOS = pacientRepository.findAll().stream()
                .map(Pacient::toDto)
                .toList();
        return pacientDTOS;
    }

    @Override
    public Optional<PacientDTO> getPacientById(Long id) {
        return Optional.empty();
    }

    @Override
    public PacientDTO addPacient(PacientDTO pacientDTO) {
        return pacientRepository.save(new Pacient(pacientDTO)).toDto();
    }

    @Override
    public PacientDTO updatePacient(PacientDTO pacientDTO) {
        return null;
    }

    @Override
    public PacientDTO deletePacient(Long id) {
        return null;
    }
}
