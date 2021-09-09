package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOMensaje;
import com.restsoap.redsocial.modelo.Mensaje;

public class MensajeDAO extends AbstractDAO<Mensaje, Long> implements IDAOMensaje {

	public MensajeDAO(Class<Mensaje> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}