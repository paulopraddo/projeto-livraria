package com.livraria.Livraria.livros.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livraria.Livraria.livros.app.restModels.AlterarLivroRestModel;
import com.livraria.Livraria.livros.domain.dataprovider.LivrosDataProvider;
import com.livraria.Livraria.livros.domain.models.LivroModel;
import com.livraria.Livraria.livros.domain.useCases.AlterarLivroUseCase;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlterarLivroService implements AlterarLivroUseCase{

    @Autowired
    private final LivrosDataProvider dataProvider;

    @Override
    public void execute(AlterarLivroRestModel restModel) {

        LivroModel modelReturn = this.dataProvider.buscarLivro(restModel.tituloLivro());

        if(restModel.coluna().equals("titulo")) {
            modelReturn.setTitulo(restModel.valor());
        } else if(restModel.coluna().equals("autor")) {
            modelReturn.setAutor(restModel.valor());
        } else if(restModel.coluna().equals("genero")) {
            modelReturn.setGenero(restModel.valor());
        } else if(restModel.coluna().equals("sinopse")) {
            modelReturn.setSinopse(restModel.valor());
        } else if(restModel.coluna().equals("anoDePublicacao")) {
            modelReturn.setAnoDePublicacao(Integer.valueOf(restModel.valor()));
        } else if(restModel.coluna().equals("numeroDePaginas")) {
            modelReturn.setNumeroDePaginas(Integer.valueOf(restModel.valor()));
        }else if(restModel.coluna().equals("preco")) {
            modelReturn.setPreco(Double.valueOf(restModel.valor()));
        }
        
        this.dataProvider.salvarLivroModel(modelReturn);
    }
    

}
