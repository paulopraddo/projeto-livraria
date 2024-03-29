package com.livraria.Livraria.livros.domain.livros.converters;

import com.livraria.Livraria.livros.app.livros.restModels.LivroRestModel;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;
import com.livraria.Livraria.utils.abstractClasses.ConvertCase;
import org.springframework.stereotype.Component;

@Component
public class LivrosModelToRestModelConverter extends ConvertCase<LivroModel, LivroRestModel> {

    @Override
    public LivroRestModel convertToDto(LivroModel entity) {
        return LivroRestModel.builder()
                .titulo(entity.getTitulo())
                .autor(entity.getAutor())
                .preco(entity.getPreco())
                .anoDePublicacao(entity.getAnoDePublicacao())
                .numeroDePaginas(entity.getNumeroDePaginas())
                .genero(entity.getGenero())
                .sinopse(entity.getSinopse())
                .build();
    }

    @Override
    public LivroModel convertToEntity(LivroRestModel dto) {
        return LivroModel.builder()
                .titulo(dto.getTitulo())
                .autor(dto.getAutor())
                .preco(dto.getPreco())
                .anoDePublicacao(dto.getAnoDePublicacao())
                .numeroDePaginas(dto.getNumeroDePaginas())
                .genero(dto.getGenero())
                .sinopse(dto.getSinopse())
                .build();
    }
}
