package com.livraria.Livraria.livros.app.livros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.Livraria.livros.domain.livros.models.LivroModel;



@Repository
public interface LivrosRepository extends JpaRepository<LivroModel, String> {

    LivroModel findByTitulo(String titulo);
    
}
