package com.livraria.Livraria.livros.domain.livros.services;

import com.livraria.Livraria.livros.domain.livros.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;
import com.livraria.Livraria.livros.domain.livros.useCases.DeletarLivroUseCase;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeletarLivroService implements DeletarLivroUseCase {

    private final LivrosDataProvider dataProvider;


    @Override
    public void execute(String titulo) {
        LivroModel model = this.dataProvider.buscarLivro(titulo);

        if(model == null) {
            throw new IllegalArgumentException("Não foi encontrado nenhum livro com esse titulo");
        }

        this.dataProvider.deletarLivro(model);
    }
}
