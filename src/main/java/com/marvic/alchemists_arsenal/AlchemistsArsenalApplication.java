package com.marvic.alchemists_arsenal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlchemistsArsenalApplication {
//    private final Logger log = LoggerFactory.getLogger(AlchemistsArsenalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AlchemistsArsenalApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(IPatientRepository pacientRepository) {
//        return (args) -> {
//
//            Patient nehemias = Patient.make("Nehemias", "masculino");
//            Patient ambar = Patient.make("Ambar", "femenino");
//            log.info("Paciente 1: {}", pacientRepository.save(nehemias));
//            log.info("Paciente 2: {}", pacientRepository.save(ambar));
//        };
//    }
}
