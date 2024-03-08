package com.livraria.Livraria.livros.services;

import com.livraria.Livraria.livros.entity.LivroModel;
import com.livraria.Livraria.livros.repositories.LivrosRepository;
import com.livraria.Livraria.livros.useCase.DeletarLivroUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeletarLivroService implements DeletarLivroUseCase {

    private final LivrosRepository repository;


    @Override
    public void execute(String titulo) {
        LivroModel model = this.repository.findByTitulo(titulo);

        if(model == null) {
            throw new IllegalArgumentException("Não foi encontrado nenhum livro com esse titulo");
        }

        this.repository.delete(model);
    }
}
