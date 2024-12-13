package com.marvic.alchemists_arsenal.interfaces;

import com.marvic.alchemists_arsenal.dtos.pacient.PacientDTO;

import java.util.List;
import java.util.Optional;

public interface IPacientService {
    List<PacientDTO> getPacients();
    Optional<PacientDTO> getPacientById(Long id);
    PacientDTO addPacient(PacientDTO pacientDTO);
    PacientDTO updatePacient(PacientDTO pacientDTO);
    PacientDTO deletePacient(Long id);
}
