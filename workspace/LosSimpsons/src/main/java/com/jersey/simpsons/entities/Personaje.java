package com.jersey.simpsons.entities;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Personaje implements Serializable {

	private String id;
	private String nombre;
	private int edad;
	private Personaje padre;
	private Personaje madre;
	private Personaje conyuge;
	private List<Personaje> hijos;
	private List<Personaje> hermanos;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Personaje getPadre() {
		return padre;
	}
	public void setPadre(Personaje padre) {
		this.padre = padre;
	}
	public Personaje getMadre() {
		return madre;
	}
	public void setMadre(Personaje madre) {
		this.madre = madre;
	}
	public Personaje getConyuge() {
		return conyuge;
	}
	public void setConyuge(Personaje conyuge) {
		this.conyuge = conyuge;
	}
	public List<Personaje> getHijos() {
		return hijos;
	}
	public void setHijos(List<Personaje> hijos) {
		this.hijos = hijos;
	}
	public List<Personaje> getHermanos() {
		return hermanos;
	}
	public void setHermanos(List<Personaje> hermanos) {
		this.hermanos = hermanos;
	}
	public Personaje(String id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	public Personaje() {
		super();
	}
	
}
