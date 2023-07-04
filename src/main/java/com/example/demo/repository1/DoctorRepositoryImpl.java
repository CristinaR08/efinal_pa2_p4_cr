package com.example.demo.repository1;

import com.example.demo.repository.modelo.Doctor;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		this.entityManager.persist(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.entityManager.merge(doctor);
		
	}

	@Override
	public Doctor buscar(Integer cedula) {
		
		return this.entityManager.find(Doctor.class, cedula);
	}

	@Override
	public void eliminar(Integer cedula) {
		Doctor doc = this.buscar(cedula);
		this.entityManager.remove(doc);
		
	}
	
}
