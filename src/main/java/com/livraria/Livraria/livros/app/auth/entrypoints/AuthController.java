package com.livraria.Livraria.livros.app.auth.entrypoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livraria.Livraria.livros.app.auth.restModels.UserRegister;
import com.livraria.Livraria.livros.domain.auth.converters.UserRegisterToUserConverter;
import com.livraria.Livraria.livros.domain.auth.models.User;
import com.livraria.Livraria.livros.domain.auth.useCases.RegistrarUsuarioUseCase;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/auth")
@AllArgsConstructor
public class AuthController implements AuthResource{

    private final RegistrarUsuarioUseCase registrarUsuarioUseCase;
    private final UserRegisterToUserConverter userRegisterToUserConverter;
    
    @Override
    @PostMapping(value = "/register")
    public User register(@RequestBody UserRegister dto) {
     
        User user = this.userRegisterToUserConverter.convertToEntity(dto);

        return this.registrarUsuarioUseCase.execute(user);
    }


}
