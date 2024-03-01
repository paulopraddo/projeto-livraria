package com.livraria.Livraria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
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
