package com.example.demo.repository1;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorRepository {

	public void insertar(Doctor doctor);
	public void actualizar(Doctor doctor);
	public Doctor buscar(Integer cedula);
	public void eliminar(Integer cedula);
	
}
