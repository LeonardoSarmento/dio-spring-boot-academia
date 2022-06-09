package me.dio.academia.digital.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl {

    private MatriculaRepository matriculaRepository;
    
    private AlunoRepository alunoRepository;

    public Matricula create(@Valid MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    public Matricula get(Long id){
        return ((Aluno) matriculaRepository.findById(id)).get();
    }

    public List<Matricula> getAll() {
        return (List<Matricula>) matriculaRepository.findAll();
    }

    public void delete(long id) {}
    
}
