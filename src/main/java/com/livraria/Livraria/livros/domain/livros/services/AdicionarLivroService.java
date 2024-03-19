package com.livraria.Livraria.livros.domain.livros.services;

import com.livraria.Livraria.livros.domain.livros.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;
import com.livraria.Livraria.livros.domain.livros.useCases.AdicionarLivroUseCase;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdicionarLivroService implements AdicionarLivroUseCase {

    @Autowired
    private final LivrosDataProvider dataProvider;
    
    @Override
    public LivroModel execute(LivroModel model) {
    
        return this.dataProvider.salvarLivroModel(model);
    }
}
