package com.livraria.Livraria.livros.domain.livros.useCases;

import java.util.List;

import com.livraria.Livraria.livros.domain.livros.models.LivroModel;

public interface BuscarTodosOsLivrosUseCase {

    List<LivroModel> execute();
}
