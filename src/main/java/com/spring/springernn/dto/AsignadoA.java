package com.spring.springernn.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignado_a") // Nombre de la tabla (distinto a la clase)
public class AsignadoA {

//	Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
	private int id;
	@ManyToOne
    @JoinColumn(name="cientifico")
    private Cientifico cientifico;
	@ManyToOne
    @JoinColumn(name="proyecto")
    private Proyecto proyecto;
	
//	Constructores
	public AsignadoA() {}
	
	public AsignadoA(int id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	
}
