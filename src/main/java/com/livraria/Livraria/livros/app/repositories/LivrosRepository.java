package com.livraria.Livraria.livros.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.Livraria.livros.domain.models.LivroModel;

@Repository
public interface LivrosRepository extends JpaRepository<LivroModel, String> {

    LivroModel findByTitulo(String titulo);
}
