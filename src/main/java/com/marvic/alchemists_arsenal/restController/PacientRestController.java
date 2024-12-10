package com.marvic.alchemists_arsenal.restController;

import com.marvic.alchemists_arsenal.model.Pacient;
import com.marvic.alchemists_arsenal.services.PacientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pacients")
public class PacientRestController {
    private PacientService pacientService;

    PacientRestController(PacientService service){
        this.pacientService = service;
    }


    @GetMapping("/pacients")
    public ResponseEntity<List<Pacient>> getAllPacient(){
        return ResponseEntity.ok().body(pacientService.getAllPacients());
    }
}
