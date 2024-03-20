package com.livraria.Livraria.livros.app.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.Livraria.livros.domain.auth.models.User;

@Repository
public interface AuthRepository extends JpaRepository<User, String>{

}
