package com.restsoap.redsocial.services;

import org.springframework.stereotype.Service;

import com.restsoap.redsocial.dao.interfaces.IDAOAdministrador;
import com.restsoap.redsocial.modelo.Administrador;
import com.restsoap.redsocial.services.interfaces.IServiceAdministrador;

@Service("adminService")
public class ServiceAdministrador extends AbstractService<Administrador, Long> implements IServiceAdministrador {

	public ServiceAdministrador(IDAOAdministrador dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected final IDAOAdministrador getDao() {
		return (IDAOAdministrador) super.getDao();
	}

	@Override
	public Administrador iniciarSesion(String correo, String clave) {
		return this.getDao().iniciarSesion(correo, clave);
	}
	
}