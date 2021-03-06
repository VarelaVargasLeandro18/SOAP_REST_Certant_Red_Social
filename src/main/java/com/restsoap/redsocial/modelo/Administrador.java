package com.restsoap.redsocial.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the administrador database table.
 * 
 */
@Entity
@Table(name="administrador")
@NamedQuery(name="Administrador.findAll", query="SELECT a FROM Administrador a")
public class Administrador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_administrador")
	private Long idAdministrador;

	private String clave;

	private String correo;

	public Administrador() {
	}

	public Long getIdAdministrador() {
		return this.idAdministrador;
	}

	public void setIdAdministrador(Long idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}