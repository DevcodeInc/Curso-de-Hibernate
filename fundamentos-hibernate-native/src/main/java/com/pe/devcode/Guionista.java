package com.pe.devcode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Guionista implements Serializable{
	
	private static final long serialVersionUID = 1474549310838247652L;
	private Integer guionistaId;
	private String nombre;
	private Set<Pelicula> peliculas = new HashSet<Pelicula>();
	
	public Guionista() {
	}

	public Guionista(String nombre) {
		this.nombre = nombre;
	}

	public Integer getGuionistaId() {
		return guionistaId;
	}

	public void setGuionistaId(Integer guionistaId) {
		this.guionistaId = guionistaId;
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
		return "Guionista [guionistaId=" + guionistaId + ", nombre=" + nombre + "]";
	}

//	@Override
//	public String toString() {
//		return "Guionista [guionistaId=" + guionistaId + ", nombre=" + nombre + ", peliculas=" + peliculas + "]";
//	}
	
}
