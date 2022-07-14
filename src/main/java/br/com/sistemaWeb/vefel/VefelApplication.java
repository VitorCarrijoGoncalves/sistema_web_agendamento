package br.com.sistemaWeb.vefel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class VefelApplication {

	public static void main(String[] args) {
		SpringApplication.run(VefelApplication.class, args);
	}

}
