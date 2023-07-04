package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.IAgendarCitaService;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Efinal1Pa2P4CrApplication implements CommandLineRunner{

	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private IAgendarCitaService agendarCita;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4CrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Doctor doctor1 = new Doctor();
		doctor1.setCedula(1785236940);
		doctor1.setNombre("Ricardo");
		doctor1.setApellido("Marín");
		doctor1.setFechaNacimiento(LocalDateTime.of(1995, 03, 13, 18, 46));
		doctor1.setNumConsultorio(031);
		doctor1.setCodSenescyt(000124);
		doctor1.setGenero("Masculino");
		this.doctorService.registrar(doctor1);
		
		Paciente paciente1 = new Paciente();
		paciente1.setCedula(1726600537);
		paciente1.setNombre("Lizeth");
		paciente1.setApellido("Sanchez");
		paciente1.setCodSeguro(0002357);
		paciente1.setFechaNacimiento(LocalDateTime.of(1998, 8, 04, 16, 48));
		paciente1.setEstatura(1.55);
		paciente1.setPeso(55.00);
		paciente1.setGenero("Femenino");
		this.pacienteService.ingresar(paciente1);
		
		CitaMedica cita1 = new CitaMedica();
		cita1.setNumCita(0354);
		cita1.setFechaCita(LocalDateTime.of(2023, 05, 25, 13, 55));
		cita1.setValorCita(new BigDecimal(15.50));
		cita1.setLugarCita("Hospital Metropolitano");
		cita1.setDoctor(doctor1);
		cita1.setPaciente(paciente1);
		this.agendarCita.ingresar(cita1);
		
		
		
		
		
	}

}
