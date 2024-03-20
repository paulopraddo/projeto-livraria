package com.livraria.Livraria.livros.domain.auth.useCases;

import com.livraria.Livraria.livros.domain.auth.models.User;

public interface RegistrarUsuarioUseCase {
    
    User execute(User user);
}
