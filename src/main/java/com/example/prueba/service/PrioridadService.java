package com.example.prueba.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.models.PrioridadModel;
import com.example.prueba.repositories.PrioridadRepository;

@Service
public class PrioridadService {
	@Autowired
	PrioridadRepository prioridadRepository;

	public ArrayList<PrioridadModel> obtenerPrioridades() {
		return (ArrayList<PrioridadModel>) (prioridadRepository.findAll());
	}

	public PrioridadModel guardarPrioridad(PrioridadModel prioridad) {
		return prioridadRepository.save(prioridad);
	}

}
