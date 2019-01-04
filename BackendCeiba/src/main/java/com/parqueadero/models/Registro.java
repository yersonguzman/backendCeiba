package com.parqueadero.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "Registro")
public class Registro {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id_registro")
	private long idRegistro;
	
	@NotNull
	@Column (name = "fk_id_vehiculo")
	private String idVehiculo;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name= "id_Vehiculo",insertable= false, updatable=false)
	private Vehiculo VehiculoRegistro;
	
	@NotNull
	@Column (name = "total_pago")
	private BigDecimal totalPago;

	public long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(long idRegistro) {
		this.idRegistro = idRegistro;
	}

	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Vehiculo getVehiculoRegistro() {
		return VehiculoRegistro;
	}

	public void setVehiculoRegistro(Vehiculo vehiculoRegistro) {
		VehiculoRegistro = vehiculoRegistro;
	}

	public BigDecimal getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(BigDecimal totalPago) {
		this.totalPago = totalPago;
	}
}
