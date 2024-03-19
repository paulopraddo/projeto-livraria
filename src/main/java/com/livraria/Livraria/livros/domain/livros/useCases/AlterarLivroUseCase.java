package com.livraria.Livraria.livros.domain.livros.useCases;

import com.livraria.Livraria.livros.app.livros.restModels.AlterarLivroRestModel;

public interface AlterarLivroUseCase {
    void execute(AlterarLivroRestModel restModel);
}
