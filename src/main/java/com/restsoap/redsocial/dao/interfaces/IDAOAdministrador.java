package com.restsoap.redsocial.dao.interfaces;

import com.restsoap.redsocial.modelo.Administrador;

public interface IDAOAdministrador extends IDAO<Administrador, Long> {	
	
	public Administrador iniciarSesion( String correo, String clave  );
	
}