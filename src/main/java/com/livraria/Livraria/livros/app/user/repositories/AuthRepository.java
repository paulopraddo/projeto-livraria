package com.livraria.Livraria.livros.app.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.Livraria.livros.domain.user.models.LoginUserDetailsModel;

@Repository
public interface AuthRepository extends JpaRepository<LoginUserDetailsModel, String> {
    
}
