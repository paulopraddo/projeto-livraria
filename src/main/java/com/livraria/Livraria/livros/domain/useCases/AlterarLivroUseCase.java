package com.livraria.Livraria.livros.domain.useCases;

import com.livraria.Livraria.livros.app.restModels.AlterarLivroRestModel;

public interface AlterarLivroUseCase {
    void execute(AlterarLivroRestModel restModel);
}
