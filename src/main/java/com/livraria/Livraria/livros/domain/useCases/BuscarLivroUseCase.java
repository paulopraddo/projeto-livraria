package com.livraria.Livraria.livros.domain.useCases;

import com.livraria.Livraria.livros.domain.models.LivroModel;

public interface BuscarLivroUseCase {

    LivroModel execute(String titulo);
}
