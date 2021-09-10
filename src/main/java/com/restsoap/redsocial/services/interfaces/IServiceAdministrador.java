package com.restsoap.redsocial.services.interfaces;

import com.restsoap.redsocial.modelo.Administrador;

public interface IServiceAdministrador extends IService<Administrador, Long> {
	
	public Administrador iniciarSesion( String correo, String clave );
	
}