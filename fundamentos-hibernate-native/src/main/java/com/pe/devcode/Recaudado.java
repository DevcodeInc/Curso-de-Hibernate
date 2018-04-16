package com.pe.devcode;

import java.io.Serializable;

public class Recaudado implements Serializable{
	
	private static final long serialVersionUID = -285489013928834257L;
	private String recaudadoId;
	private Double sumaRecuada;
	private String pais;
	private Pelicula pelicula;
	
	public Recaudado() {}
	
	public Recaudado(String recaudadoId,Double sumaRecuada, String pais) {
		this.recaudadoId= recaudadoId;
		this.sumaRecuada = sumaRecuada;
		this.pais = pais;
	}

	public String getRecaudadoId() {
		return recaudadoId;
	}

	public void setRecaudadoId(String recaudadoId) {
		this.recaudadoId = recaudadoId;
	}

	public Double getSumaRecuada() {
		return sumaRecuada;
	}

	public void setSumaRecuada(Double sumaRecuada) {
		this.sumaRecuada = sumaRecuada;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Recaudado [recaudadoId=" + recaudadoId + ", sumaRecuada=" + sumaRecuada + ", pais=" + pais + "]";
	}
}
