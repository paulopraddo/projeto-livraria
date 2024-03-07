package com.livraria.Livraria.livros.useCase;

import com.livraria.Livraria.livros.entity.LivroModel;

import java.util.List;

public interface BuscarTodosOsLivrosUseCase {

    List<LivroModel> execute();
}
