package com.parqueadero.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.parqueadero.models.Vehiculo;
import com.parqueadero.query.RestConsulta;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, String>{
	
	@Query(value ="select count(v) from Vehiculo v where v.tipo = :tipo")
	Integer contarporClaseVehiculo(@Param ("tipo")String tipo);
	
	@Query(value="SELECT v.placa, v.tipo, r.fecha_ingreso FROM  vehiculo v INNER JOIN registro r on r.fk_placa = v.placa WHERE r.fecha_salida is null",nativeQuery = true)
	List <RestConsulta> restConsultar();
	
	

}
