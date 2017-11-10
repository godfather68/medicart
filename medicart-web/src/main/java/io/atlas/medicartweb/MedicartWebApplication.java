package io.atlas.medicartweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.atlas.medicartcore", "io.atlas.medicartweb"})
public class MedicartWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicartWebApplication.class, args);
	}
}