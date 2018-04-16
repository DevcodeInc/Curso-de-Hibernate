package com.pe.devcode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pelicula implements Serializable{
	private static final long serialVersionUID = -2508283344048508578L;
	
	private Integer peliculaId;
	
	private String nombre;
	
	private Metadata metadata; 
	
	private Set<Genero> generos = new HashSet<Genero>();
	
	private List<Actor> actores = new ArrayList<Actor>();
	
	private Distribuidor distribuidor;
	
	private Set<Guionista> guionistas = new HashSet<Guionista>();
	
	private Map<String,Recaudado> recaudados = new HashMap<String,Recaudado>();
	
	private Calidad calidad;
	
	public Pelicula() {}

	public Pelicula(String nombre, Metadata metadata, Distribuidor distribuidor, Calidad calidad) {
		this.nombre = nombre;
		this.metadata = metadata;
		this.distribuidor = distribuidor;
		this.calidad = calidad;
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

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Set<Genero> getGeneros() {
		return generos;
	}

	public void setGeneros(Set<Genero> generos) {
		this.generos = generos;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public Distribuidor getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}

	public Set<Guionista> getGuionistas() {
		return guionistas;
	}

	public void setGuionistas(Set<Guionista> guionistas) {
		this.guionistas = guionistas;
	}

	public Calidad getCalidad() {
		return calidad;
	}

	public void setCalidad(Calidad calidad) {
		this.calidad = calidad;
	}

	public Map<String, Recaudado> getRecaudados() {
		return recaudados;
	}

	public void setRecaudados(Map<String, Recaudado> recaudados) {
		this.recaudados = recaudados;
	}

	@Override
	public String toString() {
		return "Pelicula [peliculaId=" + peliculaId + ", nombre=" + nombre + ", metadata=" + metadata + ", generos="
				+ generos + ", actores=" + actores + ", distribuidor=" + distribuidor + ", guionistas=" + guionistas
				+ ", recaudados=" + recaudados + ", calidad=" + calidad + "]";
	}

//	@Override
//	public String toString() {
//		return "Pelicula [peliculaId=" + peliculaId + ", nombre=" + nombre + ", metadata=" + metadata + ", generos="
//				+ generos + ", distribuidor=" + distribuidor + ", guionistas=" + guionistas
//				+ ", calidad=" + calidad + "]";
//	}
	
	
}
