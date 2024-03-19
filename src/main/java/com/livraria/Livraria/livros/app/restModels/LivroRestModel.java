package com.livraria.Livraria.livros.app.restModels;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivroRestModel {

    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private Integer anoDePublicacao;
    private Integer numeroDePaginas;
    private Double preco;
}
