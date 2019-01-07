package com.parqueadero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.parqueadero.models.Registro;

@Repository
public interface RegistroRepository  extends JpaRepository<Registro, Long>{

}
