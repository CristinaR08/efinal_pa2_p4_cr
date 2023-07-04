package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cita_medica")
@Entity
public class CitaMedica {
	@SequenceGenerator(name = "seq_cita_medica", sequenceName = "seq_cita_medica",allocationSize = 1)
	@GeneratedValue(generator = "seq_cita_medica",strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "cime_id")
	private Integer id;
	@Column(name = "cime_numero_cita")
	private Integer numCita;
	@Column(name = "cime_fecha_cita")
	private LocalDateTime fechaCita;
	@Column(name = "cime_valor_cita")
	private BigDecimal valorCita;
	@Column(name = "cime_lugar_cita")
	private String lugarCita;
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	@Column(name = "cime_receta")
	private String receta;
	@Column(name = "cime_fecha_proxima_cita")
	private LocalDateTime fechaProxCita;
	
	
	@ManyToOne
	@JoinColumn(name ="doct_id")
	private Doctor doctor;
	
	@ManyToOne
	@JoinColumn(name ="paci_id")
	private Paciente paciente;
	
	
	//getters, setters y toString
	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numCita=" + numCita + ", fechaCita=" + fechaCita + ", valorCita=" + valorCita
				+ ", lugarCita=" + lugarCita + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", fechaProxCita=" + fechaProxCita + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumCita() {
		return numCita;
	}
	public void setNumCita(Integer numCita) {
		this.numCita = numCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getValorCita() {
		return valorCita;
	}
	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDateTime getFechaProxCita() {
		return fechaProxCita;
	}
	public void setFechaProxCita(LocalDateTime fechaProxCita) {
		this.fechaProxCita = fechaProxCita;
	}
	public Doctor getDoctor() {
		Doctor j = new Doctor();
		j.setCedula(id);
		return j;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
}
