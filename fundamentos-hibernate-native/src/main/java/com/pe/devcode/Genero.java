package com.pe.devcode;

import java.io.Serializable;

public class Genero implements Serializable{

	private static final long serialVersionUID = 6380376299660685839L;

	private Integer generoId;

	private String nombre;
	
	public Genero() {}

	public Genero(String nombre) {
		this.nombre = nombre;
	}

	public Integer getGeneroId() {
		return generoId;
	}

	public void setGeneroId(Integer generoId) {
		this.generoId = generoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Genero [generoId=" + generoId + ", nombre=" + nombre + "]";
	}
}
