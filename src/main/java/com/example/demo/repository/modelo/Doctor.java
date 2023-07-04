package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "doctor")
@Entity
public class Doctor {
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor",allocationSize = 1)
	@GeneratedValue(generator = "seq_doctor",strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "doct_id")
	private Integer id;
	@Column(name = "doct_cedula")
	private Integer cedula;
	@Column(name = "doct_nombre")
	private String nombre;
	@Column(name = "doct_apellido")
	private String apellido;
	@Column(name = "doct_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "doct_numero_consultorio")
	private Integer numConsultorio;
	@Column(name = "doct_codigo_senescyt")
	private Integer codSenescyt;
	@Column(name = "doct_genero")
	private String genero;
	
	@OneToMany(mappedBy = "doctor")
	private List<CitaMedica> citasmedicas;
	
	//getters y setters /toString
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", numConsultorio=" + numConsultorio + ", codSenescyt="
				+ codSenescyt + ", genero=" + genero + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getNumConsultorio() {
		return numConsultorio;
	}
	public void setNumConsultorio(Integer numConsultorio) {
		this.numConsultorio = numConsultorio;
	}
	public Integer getCodSenescyt() {
		return codSenescyt;
	}
	public void setCodSenescyt(Integer codSenescyt) {
		this.codSenescyt = codSenescyt;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
