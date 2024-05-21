package com.roman.examenes.service.impl;

import org.springframework.stereotype.Service;

import com.roman.common.usuario.models.entity.Pregunta;
import com.roman.commons.service.CommonService;
import com.roman.commons.service.CommonServiceImpl;
import com.roman.examenes.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {

}
