package com.livraria.Livraria.services;

import com.livraria.Livraria.entity.LivroModel;
import com.livraria.Livraria.repositories.LivrosRepository;
import com.livraria.Livraria.useCase.AdicionarLivroUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
