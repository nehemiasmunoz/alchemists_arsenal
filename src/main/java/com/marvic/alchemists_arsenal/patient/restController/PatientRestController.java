package com.marvic.alchemists_arsenal.patient.restController;

import com.marvic.alchemists_arsenal.patient.dtos.PatientDTO;
import com.marvic.alchemists_arsenal.patient.interfaces.IPatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacients")
public class PatientRestController {
    private final IPatientService pacientService;

    PatientRestController(IPatientService service) {
        this.pacientService = service;
    }


    @GetMapping("/")
    public ResponseEntity<List<PatientDTO>> getAllPacient() {
        List<PatientDTO> pacients = pacientService.getPacients();
        return ResponseEntity.ok().body(pacients);
    }

    @PostMapping("/save/")
    public ResponseEntity<PatientDTO> savePacient(@RequestBody PatientDTO pacient) {
        PatientDTO patientDTO = pacientService.addPacient(pacient);
        return ResponseEntity.ok().body(patientDTO);
    }
}
