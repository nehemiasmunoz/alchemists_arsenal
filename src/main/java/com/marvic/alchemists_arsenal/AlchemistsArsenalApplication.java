package com.marvic.alchemists_arsenal;

import com.marvic.alchemists_arsenal.model.patient.Patient;
import com.marvic.alchemists_arsenal.repository.patient.IPatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlchemistsArsenalApplication {
    private final Logger log = LoggerFactory.getLogger(AlchemistsArsenalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AlchemistsArsenalApplication.class, args);
    }

    @Bean
    CommandLineRunner init(IPatientRepository pacientRepository) {
        return (args) -> {

            Patient nehemias = Patient.make("Nehemias", "masculino");
            Patient ambar = Patient.make("Ambar", "femenino");
            log.info("Paciente 1: {}", pacientRepository.save(nehemias));
            log.info("Paciente 2: {}", pacientRepository.save(ambar));
        };
    }
}
