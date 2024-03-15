package com.livraria.Livraria.livros.domain.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livros_model")
public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private Integer anoDePublicacao;
    private Integer numeroDePaginas;
    private Double preco;
}
