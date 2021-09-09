package com.restsoap.redsocial.dao;

import com.restsoap.redsocial.dao.interfaces.IDAOComentario;
import com.restsoap.redsocial.modelo.Comentario;

public class ComentarioDAO extends AbstractDAO<Comentario, Long> implements IDAOComentario {

	public ComentarioDAO(Class<Comentario> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
		
}