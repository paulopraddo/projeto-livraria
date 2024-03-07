package com.livraria.Livraria.services;

import com.livraria.Livraria.entity.LivroModel;
import com.livraria.Livraria.repositories.LivrosRepository;
import com.livraria.Livraria.useCase.BuscarTodosOsLivrosUseCase;
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
