package com.restsoap.redsocial.rest.interfaces;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;

import com.restsoap.redsocial.modelo.Administrador;

public interface IRESTAdmin extends IREST<Administrador, Long> {

	@PostMapping("/iniciarSesion")
	public Administrador iniciarSesion( Map<String, String> json );
	
}
