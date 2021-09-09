package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOCiudad;
import com.restsoap.redsocial.modelo.Ciudad;

public class CiudadDAO extends AbstractDAO<Ciudad, Long> implements IDAOCiudad {

	public CiudadDAO(Class<Ciudad> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}