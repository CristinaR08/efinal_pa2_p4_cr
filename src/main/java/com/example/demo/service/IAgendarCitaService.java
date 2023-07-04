package com.example.demo.service;

import com.example.demo.repository.modelo.CitaMedica;

public interface IAgendarCitaService {

	public void ingresar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);

}
