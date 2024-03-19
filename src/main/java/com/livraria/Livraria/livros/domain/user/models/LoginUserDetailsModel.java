package com.livraria.Livraria.livros.domain.user.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserDetailsModel {

    @Id
    private String id;
    private String username;
    private String nome;
    private String senha;
    private String email;
    private String endereco;
    private String role;
}
