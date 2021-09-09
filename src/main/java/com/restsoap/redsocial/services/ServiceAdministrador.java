package com.restsoap.redsocial.services;

import org.springframework.stereotype.Service;

import com.restsoap.redsocial.dao.interfaces.IDAOAdministrador;
import com.restsoap.redsocial.modelo.Administrador;
import com.restsoap.redsocial.services.interfaces.IServiceAdministrador;

@Service
public class ServiceAdministrador extends AbstractService<Administrador, Long> implements IServiceAdministrador {

	public ServiceAdministrador(IDAOAdministrador dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}
	
}