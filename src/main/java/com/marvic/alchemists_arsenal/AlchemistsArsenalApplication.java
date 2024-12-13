package com.marvic.alchemists_arsenal;

import com.marvic.alchemists_arsenal.model.pacient.Pacient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlchemistsArsenalApplication {
	private Logger log = LoggerFactory.getLogger(AlchemistsArsenalApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AlchemistsArsenalApplication.class, args);
	}

	@Bean
	CommandLineRunner init(IPacientRepository pacientRepository){
		return (args) -> {

			Pacient nehemias = Pacient.make("Nehemias", "masculino");
			Pacient ambar = Pacient.make("Ambar", "femenino");
			log.info("Paciente 1: {}", pacientRepository.save(nehemias));
			log.info("Paciente 2: {}", pacientRepository.save(ambar));
		};
	}
}
