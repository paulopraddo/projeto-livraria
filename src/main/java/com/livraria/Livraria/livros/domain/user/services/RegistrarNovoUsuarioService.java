package com.livraria.Livraria.livros.domain.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livraria.Livraria.livros.app.user.repositories.AuthRepository;
import com.livraria.Livraria.livros.domain.user.models.LoginUserDetailsModel;
import com.livraria.Livraria.livros.domain.user.useCases.RegistrarNovoUsuarioUseCase;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegistrarNovoUsuarioService implements RegistrarNovoUsuarioUseCase{

    @Autowired
    private final AuthRepository repository;

    @Override
    public LoginUserDetailsModel execute(LoginUserDetailsModel model) {
        
        if(model == null) {
            throw new IllegalArgumentException("Não é possivel salvar um usuario nulo");
        }
        
        return this.repository.save(model);
    }

}
