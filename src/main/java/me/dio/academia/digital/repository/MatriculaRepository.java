package me.dio.academia.digital.repository;

import antlr.collections.List;
import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository {

    Matricula save(Matricula matricula);

    Object findById(Long id);

    List findAll();
}
