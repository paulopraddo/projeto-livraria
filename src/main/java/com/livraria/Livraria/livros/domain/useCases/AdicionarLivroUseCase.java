package com.livraria.Livraria.livros.domain.useCases;

import com.livraria.Livraria.livros.domain.models.LivroModel;

public interface AdicionarLivroUseCase {
    LivroModel execute(LivroModel model);
}
