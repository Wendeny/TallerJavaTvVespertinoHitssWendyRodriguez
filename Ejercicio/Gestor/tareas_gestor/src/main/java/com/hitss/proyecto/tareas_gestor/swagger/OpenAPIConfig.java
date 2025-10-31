package com.hitss.proyecto.tareas_gestor.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        
        final String securitySchemeName = "basicAuth"; 

        return new OpenAPI()
                .info(new Info()
                        .title("Gestor de Tareas API")
                        .version("v1.0")
                        .description("API para gestionar tareas con seguridad de Admin/User.")
                )
                // 2. SÓLO DEFINIMOS el esquema de seguridad
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("basic")
                                .description("Autenticación Básica (Usuario y Contraseña)")
                        )
                );
                
    }

}
