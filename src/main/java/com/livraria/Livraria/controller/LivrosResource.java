package com.livraria.Livraria.controller;


import com.livraria.Livraria.entity.LivroModel;
import com.livraria.Livraria.restModels.LivroRestModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LivrosResource {

    List<LivroModel> buscarTodosOsLivros();

    ResponseEntity adicionarLivro(LivroRestModel restModel);
}
