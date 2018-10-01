package it.codegen.hbdcg.hbdcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HbdcgApplication  extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(HbdcgApplication.class, args);
	}
}
