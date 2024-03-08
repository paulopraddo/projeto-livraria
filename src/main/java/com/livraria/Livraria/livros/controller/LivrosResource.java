package com.livraria.Livraria.livros.controller;


import com.livraria.Livraria.livros.entity.LivroModel;
import com.livraria.Livraria.livros.restModels.DeletarLivroRestModel;
import com.livraria.Livraria.livros.restModels.LivroRestModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LivrosResource {

    List<LivroModel> buscarTodosOsLivros();

    ResponseEntity<Object> adicionarLivro(LivroRestModel restModel);

    ResponseEntity<Object> deletarLivro(DeletarLivroRestModel restModel);
}
