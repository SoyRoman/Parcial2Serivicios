package com.roman.curso.service;

import org.springframework.stereotype.Service;

import com.roman.common.usuario.models.entity.Curso;
import com.roman.commons.service.CommonService;
import com.roman.commons.service.CommonServiceImpl;
import com.roman.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso,CursoRepository> implements CommonService<Curso>{

}
