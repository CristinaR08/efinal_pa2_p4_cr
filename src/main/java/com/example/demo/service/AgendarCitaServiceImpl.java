package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository1.ICitaMedicaRepository;

@Service
public class AgendarCitaServiceImpl implements IAgendarCitaService{

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;

	@Override
	public void ingresar(CitaMedica citaMedica) {
		this.citaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		this.citaMedicaRepository.actualizar(citaMedica);
	}
	
}
