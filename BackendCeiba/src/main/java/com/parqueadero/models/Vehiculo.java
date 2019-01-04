package com.parqueadero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import java.time.LocalDateTime;
import javax.persistence.Column;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_vehiculo")
	private Long idVehiculo;
	
	
	@NotNull
	@Column(name="placa_vehiculo", nullable = false)
	private String placa;
	
	@NotNull
	@Column(name ="cilindraje")
	private Integer cilindraje;
	
	@NotNull
	@Column (name = "fecha_ingreso")
	private LocalDateTime fechaIngreso;
	
	@NotNull
	@Column (name= "tipo")
	private String tipo;

	public Long getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Vehiculo (String placa,Integer cilindraje,LocalDateTime fechaIngreso, String tipo) {
		this.placa = placa;
		this.cilindraje = cilindraje;
		this.fechaIngreso= fechaIngreso;
		this.tipo = tipo;
		
		
	}
	
	
}
