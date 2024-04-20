package com.roman.usuario.service;

import java.util.Optional;
import com.roman.usuario.entity.Alumno;


public interface AlumnoService {
	
	public Iterable<Alumno> findAll();
	public Optional<Alumno> findById(Long id);
	public Alumno save(Alumno alumno);
	public void deleteById (Long id);

}
