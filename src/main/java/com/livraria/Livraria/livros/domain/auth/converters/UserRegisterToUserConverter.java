package com.livraria.Livraria.livros.domain.auth.converters;

import org.springframework.stereotype.Component;

import com.livraria.Livraria.livros.app.auth.restModels.UserRegister;
import com.livraria.Livraria.livros.domain.auth.models.User;
import com.livraria.Livraria.utils.abstractClasses.ConvertCase;

@Component
public class UserRegisterToUserConverter extends ConvertCase<User, UserRegister>{

    @Override
    public UserRegister convertToDto(User entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'convertToDto'");
    }

    @Override
    public User convertToEntity(UserRegister dto) {
        return User.builder()
            .username(dto.username())
            .name(dto.name())
            .email(dto.email())
            .password(dto.password())
            .adress(dto.adress())
            .cellNumber(dto.cellNumber())
            .role(dto.role())
            .build();
    }

}
