package com.spring.springernn.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cientificos") // Nombre de la tabla (distinto a la clase)
public class Cientifico {
	
//	Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
	private String dni;
	private String nomapels;

//	Constructores
	
	public Cientifico() {}
	
	public Cientifico(String dni, String nomapels) {
		this.dni = dni;
		this.nomapels = nomapels;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}
	
	
}
