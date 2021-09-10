package com.restsoap.redsocial.dao;

import javax.persistence.TypedQuery;

import com.restsoap.redsocial.dao.interfaces.IDAOAdministrador;
import com.restsoap.redsocial.modelo.Administrador;

public class AdministradorDAO extends AbstractDAO<Administrador, Long> implements IDAOAdministrador {

	public AdministradorDAO() {
		super(Administrador.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Administrador iniciarSesion(String correo, String clave) {
		TypedQuery<Administrador> query = this.getEntityManager().createQuery(
				"FROM Administrador A "
				+ "WHERE "
				+ "A.correo = :correo"
				+ "AND "
				+ "A.clave = :clave ",
				Administrador.class
		);
		query.setParameter( ":clave" , clave );
		query.setParameter(":correo", correo );
		
		return query.getSingleResult();
	}
	
	
		
}