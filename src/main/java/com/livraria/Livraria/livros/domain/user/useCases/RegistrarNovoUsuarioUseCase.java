package com.livraria.Livraria.livros.domain.user.useCases;

import com.livraria.Livraria.livros.domain.user.models.LoginUserDetailsModel;

public interface RegistrarNovoUsuarioUseCase {

    LoginUserDetailsModel execute(LoginUserDetailsModel model);

}
