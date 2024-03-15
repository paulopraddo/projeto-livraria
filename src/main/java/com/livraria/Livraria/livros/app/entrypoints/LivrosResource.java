package com.livraria.Livraria.livros.app.entrypoints;


import com.livraria.Livraria.livros.app.restModels.BuscarLivroRestModel;
import com.livraria.Livraria.livros.app.restModels.DeletarLivroRestModel;
import com.livraria.Livraria.livros.app.restModels.LivroRestModel;
import com.livraria.Livraria.livros.domain.models.LivroModel;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LivrosResource {

    List<LivroModel> buscarTodosOsLivros();

    LivroRestModel buscarLivro(BuscarLivroRestModel titulo);

    ResponseEntity<Object> adicionarLivro(LivroRestModel restModel);

    ResponseEntity<Object> deletarLivro(DeletarLivroRestModel restModel);
}
