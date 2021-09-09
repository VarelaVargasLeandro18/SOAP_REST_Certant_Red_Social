package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOSolicitud;
import com.restsoap.redsocial.modelo.Solicitud;

public class SolicitudDAO extends AbstractDAO<Solicitud, Long> implements IDAOSolicitud {

	public SolicitudDAO(Class<Solicitud> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}