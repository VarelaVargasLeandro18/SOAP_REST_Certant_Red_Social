package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOAmigo;
import com.restsoap.redsocial.modelo.Amigo;

public class AmigoDAO extends AbstractDAO<Amigo, Long> implements IDAOAmigo {

	public AmigoDAO(Class<Amigo> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}