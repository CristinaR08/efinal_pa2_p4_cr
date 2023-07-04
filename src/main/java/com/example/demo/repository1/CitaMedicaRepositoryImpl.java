package com.example.demo.repository1;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		this.entityManager.persist(citaMedica);
		
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		this.entityManager.merge(citaMedica);
		
	}
	

}
