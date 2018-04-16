package com.pe.devcode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Distribuidor implements Serializable{
	
	private static final long serialVersionUID = 7960264635881988433L;
	private Integer distribuidorId;
	private String nombre;
	private Set<Pelicula> peliculas = new HashSet<Pelicula>();
	
	public Distribuidor() {
	}

	public Distribuidor(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDistribuidorId() {
		return distribuidorId;
	}

	public void setDistribuidorId(Integer distribuidorId) {
		this.distribuidorId = distribuidorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		return "Distribuidor [distribuidorId=" + distribuidorId + ", nombre=" + nombre + "]";
	}
}
