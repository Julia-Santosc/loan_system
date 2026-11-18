package com.projeto.emprestimo.service;

import java.util.List;

import com.projeto.emprestimo.model.Colaborador;
import com.projeto.emprestimo.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService {

    private final ColaboradorRepository repository;

    public ColaboradorService(ColaboradorRepository repository) {
        this.repository = repository;
    }

    public List<Colaborador> listar() {
        return repository.findAll();
    }

    public Colaborador cadastrar(Colaborador colaborador) {
        return repository.save(colaborador);
    }
}