package com.livraria.Livraria.livros.repositories;

import com.livraria.Livraria.livros.entity.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivroModel, String> {

    LivroModel findByTitulo(String titulo);
}
