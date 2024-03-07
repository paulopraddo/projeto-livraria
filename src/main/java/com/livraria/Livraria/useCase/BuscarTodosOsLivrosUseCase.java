package com.livraria.Livraria.useCase;

import com.livraria.Livraria.entity.LivroModel;

import java.util.List;

public interface BuscarTodosOsLivrosUseCase {

    List<LivroModel> execute();
}
