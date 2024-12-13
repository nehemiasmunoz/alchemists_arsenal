package com.marvic.alchemists_arsenal.restController;

import com.marvic.alchemists_arsenal.dtos.pacient.PacientDTO;
import com.marvic.alchemists_arsenal.interfaces.IPacientService;
import com.marvic.alchemists_arsenal.model.pacient.Pacient;
import com.marvic.alchemists_arsenal.services.PacientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacients")
public class PacientRestController {
    private final IPacientService pacientService;

    PacientRestController(PacientService service){
        this.pacientService = service;
    }


    @GetMapping("/")
    public ResponseEntity<List<PacientDTO>> getAllPacient(){
        List<PacientDTO> pacients = pacientService.getPacients();
        return ResponseEntity.ok().body(pacients);
    }

    @PostMapping("/save/")
    public ResponseEntity<PacientDTO> savePacient(@RequestBody PacientDTO pacient){
        PacientDTO pacientDTO = pacientService.addPacient(pacient);
        return ResponseEntity.ok().body(pacientDTO);
    }
}
