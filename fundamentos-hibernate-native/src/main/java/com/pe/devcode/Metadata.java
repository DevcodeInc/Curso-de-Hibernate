package com.pe.devcode;

import java.io.Serializable;

public class Metadata implements Serializable{
	private static final long serialVersionUID = 4412425932156050188L;
	private Integer metadataId;
	private Integer anio;
	private String formato;
	private Pelicula pelicula;
	
	public Metadata() {
	}

	public Metadata(Integer anio, String formato) {
		this.anio = anio;
		this.formato = formato;
	}

	public Integer getMetadataId() {
		return metadataId;
	}

	public void setMetadataId(Integer metadataId) {
		this.metadataId = metadataId;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Metadata [metadataId=" + metadataId + ", anio=" + anio + ", formato=" + formato + ", pelicula="
				+ pelicula + "]";
	}
}
