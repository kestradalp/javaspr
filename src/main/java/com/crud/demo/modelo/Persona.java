package com.crud.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String telefono;
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(int id, String nombre, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return nombre;
	}
	public void setName(String name) {
		this.nombre = name;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
