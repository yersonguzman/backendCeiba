package com.parqueadero.query;

import java.time.LocalDateTime;

public class RestConsulta {
	
	private String placa;
	private String tipo;
	private LocalDateTime fechaIngreso;
	
	public RestConsulta() {
		
	}
	
	public RestConsulta(String placa, String tipo, LocalDateTime fechaIngreso) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	
}
