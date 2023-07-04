package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {

	public void registrar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscarCedula(Integer cedula);
	public void borrar(Integer cedula);
}
