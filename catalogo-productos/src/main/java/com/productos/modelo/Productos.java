package com.productos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos2")
public class Productos {
	
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(generator = "increment")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private float precio;
	
	@Column(name="departamento")
	private String departamento;
	
	// Constructor por defecto y constructor con parámetros
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productos(int id, String nombre, float precio, String departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.departamento = departamento;
	}
	// Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
