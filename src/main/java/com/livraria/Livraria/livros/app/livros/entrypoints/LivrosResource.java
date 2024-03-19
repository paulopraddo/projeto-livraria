package com.livraria.Livraria.livros.app.livros.entrypoints;


import com.livraria.Livraria.livros.app.livros.restModels.AlterarLivroRestModel;
import com.livraria.Livraria.livros.app.livros.restModels.BuscarLivroRestModel;
import com.livraria.Livraria.livros.app.livros.restModels.DeletarLivroRestModel;
import com.livraria.Livraria.livros.app.livros.restModels.LivroRestModel;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LivrosResource {

    List<LivroModel> buscarTodosOsLivros();

    LivroRestModel buscarLivro(BuscarLivroRestModel titulo);

    ResponseEntity<Object> adicionarLivro(LivroRestModel restModel);

    ResponseEntity<Object> deletarLivro(DeletarLivroRestModel restModel);

    ResponseEntity<Object> alterarLivro(AlterarLivroRestModel restModel);
}
