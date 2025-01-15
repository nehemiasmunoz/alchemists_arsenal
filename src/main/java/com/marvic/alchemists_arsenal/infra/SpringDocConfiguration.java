package com.marvic.alchemists_arsenal.infra;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {
    @Bean
    public OpenAPI configureSpringDoc() {
        return new OpenAPI().info(
                new Info()
                        .title("Alchemists Arsenal")
                        .description("Api rest de alchemists arsenal la cual contiene funcionalidades de crud solo para ingredientes por ahora.")
        );
    }
}
