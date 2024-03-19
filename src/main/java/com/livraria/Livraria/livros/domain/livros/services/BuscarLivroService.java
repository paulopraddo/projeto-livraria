package com.livraria.Livraria.livros.domain.livros.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livraria.Livraria.livros.domain.livros.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;
import com.livraria.Livraria.livros.domain.livros.useCases.BuscarLivroUseCase;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuscarLivroService implements BuscarLivroUseCase{

    @Autowired
    private final LivrosDataProvider dataProvider;

    @Override
    public LivroModel execute(String titulo) {
       return this.dataProvider.buscarLivro(titulo);
    }
    
}
