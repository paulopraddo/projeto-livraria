package com.livraria.Livraria.livros.domain.livros.dataprovider;

import java.util.List;

import com.livraria.Livraria.livros.domain.livros.models.LivroModel;

public interface LivrosDataProvider {

    LivroModel salvarLivroModel(LivroModel model);

    List<LivroModel> listarLivros();

    void deletarLivro(LivroModel model);

    LivroModel buscarLivro(String titulo);

    void alterarLivro(LivroModel model);
}
