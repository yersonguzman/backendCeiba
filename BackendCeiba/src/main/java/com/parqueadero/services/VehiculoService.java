package com.parqueadero.services;

import java.util.List;
import java.util.Optional;

import com.parqueadero.models.Vehiculo;


public interface VehiculoService {

	public Vehiculo crearVehiculo (Vehiculo vehiculo);
	
	public Optional<Vehiculo> consultarVehiculo (String placa);
	
	public Vehiculo modificarVehiculo(Vehiculo vehiculo);
	
	public void  eliminarVehiculo (String placa);
	
	public List<Vehiculo> listarVehiculos ();
	
}
