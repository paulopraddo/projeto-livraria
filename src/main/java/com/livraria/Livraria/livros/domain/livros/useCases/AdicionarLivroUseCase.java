package com.livraria.Livraria.livros.domain.livros.useCases;

import com.livraria.Livraria.livros.domain.livros.models.LivroModel;

public interface AdicionarLivroUseCase {
    LivroModel execute(LivroModel model);
}
