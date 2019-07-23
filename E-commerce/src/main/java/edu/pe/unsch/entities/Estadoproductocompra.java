package edu.pe.unsch.entities;
// Generated 22/07/2019 11:51:13 PM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Estadoproductocompra generated by hbm2java
 */
@Entity
@Table(name = "estadoproductocompra", catalog = "electro")
public class Estadoproductocompra implements java.io.Serializable {

	private Integer id;
	private String nombre;

	public Estadoproductocompra() {
	}

	public Estadoproductocompra(String nombre) {
		this.nombre = nombre;
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

	@Column(name = "nombre", length = 200)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
