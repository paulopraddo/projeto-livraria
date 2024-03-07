package com.livraria.Livraria.livros.services;

import com.livraria.Livraria.livros.entity.LivroModel;
import com.livraria.Livraria.livros.repositories.LivrosRepository;
import com.livraria.Livraria.livros.useCase.BuscarTodosOsLivrosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BuscarTodosOsLivrosService implements BuscarTodosOsLivrosUseCase {

    @Autowired
    private final LivrosRepository repository;


    @Override
    public List<LivroModel> execute() {
        return this.repository.findAll();
    }
}
