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
public class LivrosModel {

    @Id
    private String id;
    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private Integer anoDePublicacao;
    private Integer numeroDePaginas;
    private Double preco;
}
