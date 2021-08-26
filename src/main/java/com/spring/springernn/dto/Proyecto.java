package com.spring.springernn.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos") // Nombre de la tabla (distinto a la clase)
public class Proyecto {
	
//	Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
	private String id;
	private String nombre;
	private int horas;
	
	
//	Constructores
	public Proyecto() {}
	
	public Proyecto(String id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
}
