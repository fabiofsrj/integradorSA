package br.com.sempreautos.integradorSA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.sun.glass.ui.Application;

@SpringBootApplication
public class IntegradorSaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IntegradorSaApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(IntegradorSaApplication.class, args);
	}
	
	
}
