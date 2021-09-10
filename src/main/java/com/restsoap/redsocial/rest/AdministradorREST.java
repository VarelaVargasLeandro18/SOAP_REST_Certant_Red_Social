package com.restsoap.redsocial.rest;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restsoap.redsocial.modelo.Administrador;
import com.restsoap.redsocial.rest.interfaces.IRESTAdmin;
import com.restsoap.redsocial.services.interfaces.IServiceAdministrador;

@RequestMapping("/administrador")
@RestController("adminRestController")
public class AdministradorREST extends AbstractREST<Administrador, Long> implements IRESTAdmin {

	public AdministradorREST(IServiceAdministrador service) {
		super(service);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected IServiceAdministrador getService() {
		return (IServiceAdministrador) super.getService();
	}

	@Override
	public Administrador iniciarSesion(Map<String, String> json) {
		
		if ( !json.containsKey("correo") || !json.containsKey("clave") ) return null;
		
		String correo = json.get("correo");
		String clave  = json.get("clave");

		return this.getService().iniciarSesion(correo, clave);
	}

}
