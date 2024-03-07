package com.livraria.Livraria.livros.repositories;

import com.livraria.Livraria.livros.entity.LoginUserDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<LoginUserDetailsModel, String> {
}
