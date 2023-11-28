package com.example.prueba.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.models.PrioridadModel;

@Repository
public interface PrioridadRepository extends CrudRepository<PrioridadModel, Integer>  {

}
