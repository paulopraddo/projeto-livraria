package com.livraria.Livraria.livros.domain.services;

import com.livraria.Livraria.livros.domain.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.models.LivroModel;
import com.livraria.Livraria.livros.domain.useCases.AdicionarLivroUseCase;

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
