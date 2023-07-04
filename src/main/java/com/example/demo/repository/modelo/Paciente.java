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

@Table(name = "paciente")
@Entity
public class Paciente {
	@SequenceGenerator(name = "seq_paciente", sequenceName = "seq_paciente",allocationSize = 1)
	@GeneratedValue(generator = "seq_paciente",strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "paci_id")
	private Integer id;
	@Column(name = "paci_cedula")
	private Integer cedula;
	@Column(name = "paci_nombre")
	private String nombre;
	@Column(name = "paci_apellido")
	private String apellido;
	@Column(name = "paci_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "paci_codigo_seguro")
	private Integer codSeguro;
	@Column(name = "paci_estatura")
	private Double estatura;
	@Column(name = "paci_peso")
	private Double peso;
	@Column(name = "paci_genero")
	private String genero;
	
	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citasmedicas;

	//getters&setters y toString
	
	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", codSeguro=" + codSeguro + ", estatura=" + estatura
				+ ", peso=" + peso + ", genero=" + genero + "]";
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
	public Integer getCodSeguro() {
		return codSeguro;
	}
	public void setCodSeguro(Integer codSeguro) {
		this.codSeguro = codSeguro;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
