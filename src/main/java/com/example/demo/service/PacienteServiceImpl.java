package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.repository1.IPacienteRepository;

import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void ingresar(Paciente paciente) {
		this.iPacienteRepository.insertar(paciente);
		
	}

	@Override
	public void actualizar(Paciente paciente) {
		this.iPacienteRepository.actualizar(paciente);
		
	}

}
