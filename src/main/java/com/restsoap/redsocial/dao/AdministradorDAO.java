package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOAdministrador;
import com.restsoap.redsocial.modelo.Administrador;

public class AdministradorDAO extends AbstractDAO<Administrador, Long> implements IDAOAdministrador {

	public AdministradorDAO(Class<Administrador> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}