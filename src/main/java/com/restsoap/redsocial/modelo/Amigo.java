package com.restsoap.redsocial.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/** The persistent class for the amigo database table. */
@Entity
@NamedQuery(name="Amigo.findAll", query="SELECT a FROM Amigo a")
public class Amigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_amigo",nullable=false)
	private Long idAmigo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	/** Bi-directional many-to-one association to Usuario. */
	@ManyToOne
	@JoinColumn(name="id_usuarioE")
	private Usuario usuario1;

	/** Bi-directional many-to-one association to Usuario. */
	@ManyToOne
	@JoinColumn(name="id_usuarioR")
	private Usuario usuario2;

	public Long getIdAmigo() {
		return this.idAmigo;
	}

	public void setIdAmigo(Long idAmigo) {
		this.idAmigo = idAmigo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario1() {
		return this.usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public Usuario getUsuario2() {
		return this.usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}
}