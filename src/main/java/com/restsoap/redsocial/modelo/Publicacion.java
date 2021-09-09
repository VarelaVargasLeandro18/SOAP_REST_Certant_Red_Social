package com.restsoap.redsocial.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/** The persistent class for the publicacion database table. */
@Entity
@NamedQuery(name="Publicacion.findAll", query="SELECT p FROM Publicacion p")
public class Publicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_publicacion",nullable=false)
	private int idPublicacion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String foto;

	@Lob
	private String publicacion;

	/** Bi-directional many-to-one association to Comentario. */
	@OneToMany(mappedBy="publicacion")
	private List<Comentario> comentarios;

	/** Bi-directional many-to-one association to Usuario. */
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public int getIdPublicacion() {
		return this.idPublicacion;
	}

	public void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getPublicacion() {
		return this.publicacion;
	}

	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setPublicacion(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setPublicacion(null);

		return comentario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}