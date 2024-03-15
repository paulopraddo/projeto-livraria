package com.livraria.Livraria.livros.domain.useCases;

import java.util.List;

import com.livraria.Livraria.livros.domain.models.LivroModel;

public interface BuscarTodosOsLivrosUseCase {

    List<LivroModel> execute();
}
