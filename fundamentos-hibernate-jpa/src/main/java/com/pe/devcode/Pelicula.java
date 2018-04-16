package com.pe.devcode;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PELICULA")
public class Pelicula implements Serializable{
	private static final long serialVersionUID = -2508283344048508578L;
	
	@Id
	@Column(name="PELICULA_ID")
	private Integer peliculaId;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	public Pelicula() {
	}

	public Pelicula(Integer peliculaId, String nombre) {
		this.peliculaId = peliculaId;
		this.nombre = nombre;
	}

	public Integer getPeliculaId() {
		return peliculaId;
	}

	public void setPeliculaId(Integer peliculaId) {
		this.peliculaId = peliculaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pelicula [peliculaId=" + peliculaId + ", nombre=" + nombre + "]";
	}	
}
