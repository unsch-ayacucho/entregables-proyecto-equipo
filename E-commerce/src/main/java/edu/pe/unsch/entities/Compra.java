package edu.pe.unsch.entities;
// Generated 22/07/2019 11:51:13 PM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Compra generated by hbm2java
 */
@Entity
@Table(name = "compra", catalog = "electro")
public class Compra implements java.io.Serializable {

	private Integer id;
	private Usuario usuario;
	private Date creacion;
	private Set<Detallecompra> detallecompras = new HashSet<Detallecompra>(0);

	public Compra() {
	}

	public Compra(Usuario usuario, Date creacion, Set<Detallecompra> detallecompras) {
		this.usuario = usuario;
		this.creacion = creacion;
		this.detallecompras = detallecompras;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creacion", length = 19)
	public Date getCreacion() {
		return this.creacion;
	}

	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compra")
	public Set<Detallecompra> getDetallecompras() {
		return this.detallecompras;
	}

	public void setDetallecompras(Set<Detallecompra> detallecompras) {
		this.detallecompras = detallecompras;
	}

}
