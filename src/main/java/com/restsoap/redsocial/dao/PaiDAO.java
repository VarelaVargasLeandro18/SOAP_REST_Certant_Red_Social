package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOPai;
import com.restsoap.redsocial.modelo.Pai;

public class PaiDAO extends AbstractDAO<Pai, Long> implements IDAOPai {

	public PaiDAO(Class<Pai> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}