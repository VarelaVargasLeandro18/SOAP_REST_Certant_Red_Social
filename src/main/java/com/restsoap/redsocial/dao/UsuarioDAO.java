package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOUsuario;
import com.restsoap.redsocial.modelo.Usuario;

public class UsuarioDAO extends AbstractDAO<Usuario, Long> implements IDAOUsuario {

	public UsuarioDAO(Class<Usuario> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}