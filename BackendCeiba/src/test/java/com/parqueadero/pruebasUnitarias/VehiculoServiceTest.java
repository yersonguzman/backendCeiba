package com.parqueadero.pruebasUnitarias;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.parqueadero.services.VehiculoServiceImp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehiculoServiceTest {

	@Autowired
	VehiculoServiceImp vehiculoServiceImp;
	
	
	
	@Test
	public void ValidarPlacaA() {
		
		//arrange
		String placa = "ABC201";
		
		
		//act
		Boolean noEsValido = vehiculoServiceImp.ValidarPlaca(placa) ;
		
		
		//assert
		assertTrue(noEsValido);

	}
	
	@Test
	public void ValidarPlaca() {
		
		//arrange
		String placa = "LAT201";
		 
		
		//act
		 Boolean noEsValido = vehiculoServiceImp.ValidarPlaca(placa) ;
		
		
		//assert
		assertFalse(noEsValido);

	}
}
