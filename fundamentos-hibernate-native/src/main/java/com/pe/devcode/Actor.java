package com.pe.devcode;

import java.io.Serializable;

public class Actor implements Serializable{
	
	private static final long serialVersionUID = -4713683677990840415L;
	private Integer actorId;
	private String nombre;
	private Pelicula pelicula;
	
	public Actor() {}

	public Actor(String nombre) {
		this.nombre = nombre;
	}

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", nombre=" + nombre + "]";
	}

//	@Override
//	public String toString() {
//		return "Actor [actorId=" + actorId + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
//	}
}
