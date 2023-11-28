package com.example.prueba.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prioridad")
public class PrioridadModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer idPrioridad;
	
	private String nombre;
	
	@OneToMany(mappedBy = "idPrioridad")
    private List<UsuarioModel> usuarios;
	
	public Integer getId() {
		return idPrioridad;
	}

	public void setId(Integer id) {
		this.idPrioridad = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
