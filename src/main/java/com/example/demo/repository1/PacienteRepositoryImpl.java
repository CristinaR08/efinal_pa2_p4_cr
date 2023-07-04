package com.example.demo.repository1;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PacienteRepositoryImpl implements IPacienteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente paciente) {
		this.entityManager.persist(paciente);		
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		this.entityManager.merge(paciente);
		
	}

}
