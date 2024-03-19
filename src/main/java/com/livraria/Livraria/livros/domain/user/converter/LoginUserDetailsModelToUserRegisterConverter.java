package com.livraria.Livraria.livros.domain.user.converter;

import org.springframework.stereotype.Component;

import com.livraria.Livraria.livros.app.user.restModels.UserRegister;
import com.livraria.Livraria.livros.domain.user.models.LoginUserDetailsModel;
import com.livraria.Livraria.utils.abstractClasses.ConvertCase;

@Component
public class LoginUserDetailsModelToUserRegisterConverter extends ConvertCase<LoginUserDetailsModel, UserRegister> {

    @Override
    public UserRegister convertToDto(LoginUserDetailsModel entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToDto'");
    }

    @Override
    public LoginUserDetailsModel convertToEntity(UserRegister dto) {
        return LoginUserDetailsModel.builder()
        .username(dto.username())
        .nome(dto.nome())
        .senha(dto.senha())
        .email(dto.email())
        .endereco(dto.endereco())
        .role(dto.role()).build();
    }

}
