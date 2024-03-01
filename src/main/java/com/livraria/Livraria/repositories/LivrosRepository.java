package com.livraria.Livraria.repositories;

import com.livraria.Livraria.entity.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivrosModel, String> {
}
