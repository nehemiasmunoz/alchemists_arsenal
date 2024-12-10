package com.marvic.alchemists_arsenal.services;

import com.marvic.alchemists_arsenal.IPacientRepository;
import com.marvic.alchemists_arsenal.model.Pacient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientService {
    private IPacientRepository pacientRepository;

    PacientService(IPacientRepository repository){
        this.pacientRepository = repository;
    }

    public List<Pacient> getAllPacients(){
        return  pacientRepository.findAll();
    }
}
