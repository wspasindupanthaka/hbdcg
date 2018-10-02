package it.codegen.hbdcg;

import it.codegen.hbdcg.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.sql.SQLException;

@SpringBootApplication
public class HbdcgApplication  extends SpringBootServletInitializer
{

	public static void main(String[] args) throws SQLException
	{
		SpringApplication.run(HbdcgApplication.class, args);
//		UserService.updateToken();
	}


}
