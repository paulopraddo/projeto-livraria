package com.livraria.Livraria.livros.domain.livros.services;

import com.livraria.Livraria.livros.domain.livros.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;
import com.livraria.Livraria.livros.domain.livros.useCases.BuscarTodosOsLivrosUseCase;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BuscarTodosOsLivrosService implements BuscarTodosOsLivrosUseCase {

    @Autowired
    private final LivrosDataProvider dataProvider;

    @Override
    public List<LivroModel> execute() {
        return this.dataProvider.listarLivros();
    }
}
