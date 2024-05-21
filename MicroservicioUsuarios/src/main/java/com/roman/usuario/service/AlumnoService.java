package com.roman.usuario.service;

import com.roman.commons.service.CommonService;
import com.roman.usuario.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long Id);
}
