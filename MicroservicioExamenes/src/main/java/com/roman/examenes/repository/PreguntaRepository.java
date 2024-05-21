package com.roman.examenes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roman.common.usuario.models.entity.Pregunta;

@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {

}
