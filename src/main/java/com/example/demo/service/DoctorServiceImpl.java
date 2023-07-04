package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository1.IDoctorRepository;

import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepository doctorRepository;
	
	
	@Override
	public void registrar(Doctor doctor) {
		this.doctorRepository.insertar(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.doctorRepository.actualizar(doctor);
		
	}

	@Override
	public Doctor buscarCedula(Integer cedula) {
		return this.doctorRepository.buscar(cedula);
	}

	@Override
	public void borrar(Integer cedula) {
		this.doctorRepository.eliminar(cedula);
		
	}

}
