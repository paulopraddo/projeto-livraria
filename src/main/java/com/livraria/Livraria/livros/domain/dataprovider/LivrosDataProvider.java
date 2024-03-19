package com.livraria.Livraria.livros.domain.dataprovider;

import java.util.List;

import com.livraria.Livraria.livros.domain.models.LivroModel;

public interface LivrosDataProvider {

    LivroModel salvarLivroModel(LivroModel model);

    List<LivroModel> listarLivros();

    void deletarLivro(LivroModel model);

    LivroModel buscarLivro(String titulo);

    void alterarLivro(LivroModel model);
}
