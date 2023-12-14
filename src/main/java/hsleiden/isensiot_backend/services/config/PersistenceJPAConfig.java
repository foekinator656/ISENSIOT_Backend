package hsleiden.isensiot_backend.services.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"hsleiden.isensiot_backend.repository"})
@EntityScan(basePackages = {"hsleiden.isensiot_backend.models"})
@ComponentScan(basePackages = {"hsleiden.isensiot_backend.components"})
public class PersistenceJPAConfig {
}
