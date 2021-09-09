package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOPublicacion;
import com.restsoap.redsocial.modelo.Publicacion;

public class PublicacionDAO extends AbstractDAO<Publicacion, Long> implements IDAOPublicacion {

	public PublicacionDAO(Class<Publicacion> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}