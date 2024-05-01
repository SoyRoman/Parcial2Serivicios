package com.roman.usuario.service;

import java.util.Optional;

import com.roman.commons.service.CommonService;
import com.roman.usuario.entity.Alumno;


public interface AlumnoService extends CommonService<Alumno> {
	
	
	public Optional<Alumno> findById(Long id);
	public Alumno save(Alumno alumno);
	

}
