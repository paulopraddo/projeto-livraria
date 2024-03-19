package com.livraria.Livraria.livros.domain.livros.useCases;

import com.livraria.Livraria.livros.domain.livros.models.LivroModel;

public interface BuscarLivroUseCase {

    LivroModel execute(String titulo);
}
