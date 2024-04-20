package com.roman.usuario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roman.usuario.entity.Alumno;



public interface AlumnoRepository extends CrudRepository <Alumno, Long>{
	

}
