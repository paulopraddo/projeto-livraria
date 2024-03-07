package com.livraria.Livraria.livros.services;

import com.livraria.Livraria.livros.entity.LivroModel;
import com.livraria.Livraria.livros.repositories.LivrosRepository;
import com.livraria.Livraria.livros.useCase.AdicionarLivroUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdicionarLivroService implements AdicionarLivroUseCase {

    @Autowired
    private final LivrosRepository repository;
    @Override
    public LivroModel execute(LivroModel model) {
        return this.repository.save(model);
    }
}
