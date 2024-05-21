package com.roman.examenes.service.impl;

import org.springframework.stereotype.Service;

import com.roman.common.usuario.models.entity.Examen;
import com.roman.commons.service.CommonService;
import com.roman.commons.service.CommonServiceImpl;
import com.roman.examenes.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {

}
