package com.livraria.Livraria.livros.useCase;

import com.livraria.Livraria.livros.entity.LivroModel;

public interface AdicionarLivroUseCase {
    LivroModel execute(LivroModel model);
}
