package com.parqueadero.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parqueadero.models.Vehiculo;
import com.parqueadero.repositories.VehiculoRepository;

@Service
public class VehiculoServiceImp implements VehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;


	@Override
	public Vehiculo crearVehiculo(Vehiculo vehiculo) {
		return vehiculoRepository.save(vehiculo);
	}

	@Override
	public Optional<Vehiculo> consultarVehiculo(String placa) {
		return vehiculoRepository.findById(placa);
	}

	@Override
	public Vehiculo modificarVehiculo(Vehiculo vehiculo) {
		return vehiculoRepository.save(vehiculo);
	}

	@Override
	public void eliminarVehiculo(String placa) {
		vehiculoRepository.deleteById(placa);
		
	}

	@Override
	public List<Vehiculo> listarVehiculos() {
		return vehiculoRepository.findAll();
	}
	
	
}
