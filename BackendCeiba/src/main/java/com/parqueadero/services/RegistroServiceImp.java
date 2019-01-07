package com.parqueadero.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parqueadero.models.Registro;
import com.parqueadero.repositories.RegistroRepository;

@Service
public class RegistroServiceImp implements RegistroService{

	
	@Autowired
	private RegistroRepository registroRepository;
	
	@Override
	public Registro crearRegistro(Registro registro) {
		return registroRepository.save(registro);
	}

	@Override
	public Optional<Registro> consultarRegistro(Long idRegistro) {
		return registroRepository.findById(idRegistro);
	}

	@Override
	public Registro modificarRegistro(Registro registro) {
		return registroRepository.save(registro);
	}

	@Override
	public void eliminarRegistro(Long idRegistro) {
		registroRepository.deleteById(idRegistro);
		
	}

	@Override
	public List<Registro> listarRegistros() {
		return registroRepository.findAll();
	}

}
