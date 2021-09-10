package com.restsoap.redsocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.restsoap.redsocial.dao.AdministradorDAO;
import com.restsoap.redsocial.modelo.Administrador;
import com.restsoap.redsocial.services.ServiceAdministrador;

@SpringBootApplication
public class RedSocialApplication {
	
	static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	public static void main(String[] args) {
		SpringApplication.run(RedSocialApplication.class, args);
	}

}