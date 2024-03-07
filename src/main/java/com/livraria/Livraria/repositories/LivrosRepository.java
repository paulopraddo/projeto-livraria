package com.livraria.Livraria.repositories;

import com.livraria.Livraria.entity.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivroModel, String> {
}
