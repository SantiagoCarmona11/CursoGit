package com.example.prueba.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer idUsuario;

	private String nombre;
	private String gmail;
	private int edad;
	private int celular;

	@ManyToOne
	@JoinColumn(name = "id_prioridad", nullable = false)
	private PrioridadModel idPrioridad;

	public long getId() {
		return idUsuario;
	}

	public void setId(Integer id) {
		this.idUsuario = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public PrioridadModel gerIdPrioridad() {
		return idPrioridad;
	}

	public void setIdPrioridad(PrioridadModel prioridad) {
		this.idPrioridad = prioridad;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

}
