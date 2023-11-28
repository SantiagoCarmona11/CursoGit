package com.example.prueba.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.models.PrioridadModel;
import com.example.prueba.models.UsuarioModel;
import com.example.prueba.repositories.PrioridadRepository;
import com.example.prueba.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	PrioridadRepository prioridadRepository;

	

	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return (ArrayList<UsuarioModel>) (usuarioRepository.findAll());
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		 Optional<PrioridadModel> prioridad = prioridadRepository.findById(usuario.gerIdPrioridad().getId());
		usuario.setIdPrioridad(prioridad.get());
		return usuarioRepository.save(usuario);
	}

}
