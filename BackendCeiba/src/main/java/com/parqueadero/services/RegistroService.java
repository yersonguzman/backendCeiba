package com.parqueadero.services;

import java.util.List;
import java.util.Optional;

import com.parqueadero.models.Registro;

public interface RegistroService {
	
	public Registro crearRegistro (Registro registro);
    
	public Optional <Registro> consultarRegistro (Long idRegistro);
	
	public Registro modificarRegistro (Registro registro);
	
	public void eliminarRegistro (Long idRegistro);
	
	public List <Registro> listarRegistros();
}
