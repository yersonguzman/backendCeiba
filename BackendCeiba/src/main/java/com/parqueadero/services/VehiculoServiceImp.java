package com.parqueadero.services;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parqueadero.Exceptions.DiaNoPermitido;
import com.parqueadero.Exceptions.ParqueoLleno;
import com.parqueadero.models.Vehiculo;
import com.parqueadero.repositories.VehiculoRepository;

@Service
public class VehiculoServiceImp implements VehiculoService {

	private static final String PARQUEADERO_LLENO = "No hay espacio disponible, se encuenta lleno";
	
		
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public Vehiculo crearVehiculo(Vehiculo vehiculo) {

		boolean espacioParqueo = CapacidadEstacionamiento(vehiculo);
		if (!espacioParqueo) {
			throw new ParqueoLleno(PARQUEADERO_LLENO);
		}

		boolean restriccionPlacaA = ValidarPlaca(vehiculo.getPlaca());
		if (restriccionPlacaA) {
			boolean diaValido = IngresarDia();
			if (!diaValido) {
				throw new DiaNoPermitido("No puede ingresar este dia");
			}

		}
		vehiculoRepository.save(vehiculo);
		return vehiculo;
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

	// verificar capacidad de estacionamiento
	public boolean CapacidadEstacionamiento(Vehiculo vehiculo) {
		boolean disponible = false;
		Integer cantidad = 0;

		switch (vehiculo.getTipo()) {

		case "carro":
			cantidad = vehiculoRepository.contarporClaseVehiculo(vehiculo.getTipo());
			if (cantidad < 3)
				disponible = true;
			break;

		case "moto":
			cantidad = vehiculoRepository.contarporClaseVehiculo(vehiculo.getTipo());
			if (cantidad < 10)
				disponible = true;
			break;

		default:
			break;
		}
		return disponible;
	}

	// verificar placa si es "A"
	public boolean ValidarPlaca(String placa) {
		boolean PlacaA = false;
		if (placa.equalsIgnoreCase("A")) {
			PlacaA = true;
		}
		return PlacaA;
	}

	// verificar dia ingreso
	public boolean IngresarDia() {
		boolean diaValido = false;
		LocalDate fechaActual = getfechaActual();
		if (fechaActual.getDayOfWeek().equals(DayOfWeek.SUNDAY)
				|| fechaActual.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
			diaValido = true;
		}
		return diaValido;
	}

	public LocalDate getfechaActual() {
		return LocalDate.now();
	}
}
