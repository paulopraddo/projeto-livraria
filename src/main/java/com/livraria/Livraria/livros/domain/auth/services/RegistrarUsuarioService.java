package com.livraria.Livraria.livros.domain.auth.services;

import org.springframework.stereotype.Service;

import com.livraria.Livraria.livros.app.auth.repositories.AuthRepository;
import com.livraria.Livraria.livros.domain.auth.models.User;
import com.livraria.Livraria.livros.domain.auth.useCases.RegistrarUsuarioUseCase;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrarUsuarioService implements RegistrarUsuarioUseCase{

    private final AuthRepository repository;

    @Override
    public User execute(User user) {
        if(user == null) {
            throw new IllegalArgumentException("Null User");
        }

        return this.repository.save(user);
    }

}
