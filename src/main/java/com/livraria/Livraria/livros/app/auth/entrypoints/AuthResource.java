package com.livraria.Livraria.livros.app.auth.entrypoints;

import com.livraria.Livraria.livros.app.auth.restModels.UserRegister;
import com.livraria.Livraria.livros.domain.auth.models.User;

public interface AuthResource {

    User register(UserRegister dto);
}
