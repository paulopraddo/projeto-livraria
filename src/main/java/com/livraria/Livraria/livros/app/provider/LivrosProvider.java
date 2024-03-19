package com.livraria.Livraria.livros.app.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.livraria.Livraria.livros.app.repositories.LivrosRepository;
import com.livraria.Livraria.livros.domain.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.models.LivroModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class LivrosProvider implements LivrosDataProvider {

    @Autowired
    private final LivrosRepository repository;

    @Override
    public LivroModel salvarLivroModel(LivroModel model) {
        
        if (model == null) {
            throw new IllegalArgumentException("O objeto que você está tentando salvar é nulo");
        }
        
        return this.repository.save(model);
    }

    @Override
    public List<LivroModel> listarLivros() {
        
        return this.repository.findAll();
    }

    @Override
    public void deletarLivro(LivroModel model) {
        
        if (model == null) {
            throw new IllegalArgumentException("O livro que você está tentando deletar é nulo");
        }

        this.repository.delete(model);
    }

    @Override
    public LivroModel buscarLivro(String titulo) {
        LivroModel modelReturn = this.repository.findByTitulo(titulo);

        if(modelReturn == null) {
            throw new IllegalArgumentException("O livro que você esta procurando não pode ser encontrado no banco de dados");
        }

        return this.repository.findByTitulo(titulo);
    }

    @Override
    public void alterarLivro(LivroModel model) {

        if (model == null) {
            throw new IllegalArgumentException("O livro que você está tentando deletar é nulo");
        }

        this.repository.save(model);
    }

}
