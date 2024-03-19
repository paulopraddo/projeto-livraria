package com.livraria.Livraria.livros.app.user.entrypoints;

import org.springframework.web.bind.annotation.RestController;

import com.livraria.Livraria.livros.app.user.restModels.UserRegister;
import com.livraria.Livraria.livros.domain.user.converter.LoginUserDetailsModelToUserRegisterConverter;
import com.livraria.Livraria.livros.domain.user.models.LoginUserDetailsModel;
import com.livraria.Livraria.livros.domain.user.useCases.RegistrarNovoUsuarioUseCase;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@AllArgsConstructor
@RequestMapping("auth")
public class AuthController {

    private final RegistrarNovoUsuarioUseCase registrarNovoUsuarioUseCase;
    private final LoginUserDetailsModelToUserRegisterConverter loginUserDetailsModelToUserRegisterConverter;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody UserRegister userRegister) {
        
        LoginUserDetailsModel model = this.loginUserDetailsModelToUserRegisterConverter.convertToEntity(userRegister);
        
        this.registrarNovoUsuarioUseCase.execute(model);

        return ResponseEntity.ok().body(model);
    }
    
}
