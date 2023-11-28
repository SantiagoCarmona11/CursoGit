package com.example.prueba.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.models.PrioridadModel;
import com.example.prueba.service.PrioridadService;

@RestController
@RequestMapping("/prioridad")
public class PrioridadController {
	@Autowired
	PrioridadService prioridadService;

	@GetMapping()
	public ArrayList<PrioridadModel> obtenerPrioridades() {
		return prioridadService.obtenerPrioridades();
	}

	@PostMapping()
	public PrioridadModel guardarPrioridad(@RequestBody PrioridadModel prioridad) {
		return this.prioridadService.guardarPrioridad(prioridad);
	}

}
