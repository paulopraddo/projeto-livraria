package com.livraria.Livraria.livros.controller;

import com.livraria.Livraria.livros.converters.LivrosModelToRestModelConverter;
import com.livraria.Livraria.livros.entity.LivroModel;
import com.livraria.Livraria.livros.restModels.DeletarLivroRestModel;
import com.livraria.Livraria.livros.restModels.LivroRestModel;
import com.livraria.Livraria.livros.useCase.AdicionarLivroUseCase;
import com.livraria.Livraria.livros.useCase.BuscarTodosOsLivrosUseCase;
import com.livraria.Livraria.livros.useCase.DeletarLivroUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
@AllArgsConstructor
public class LivrosController implements LivrosResource{

    private final BuscarTodosOsLivrosUseCase buscarTodosOsLivrosUseCase;
    private final AdicionarLivroUseCase adicionarLivroUseCase;
    private final DeletarLivroUseCase deletarLivroUseCase;
    private final LivrosModelToRestModelConverter livrosModelToRestModelConverter;

    @Override
    @GetMapping
    public List<LivroModel> buscarTodosOsLivros() {

        return this.buscarTodosOsLivrosUseCase.execute();
    }

    @Override
    @PostMapping(value = "/adicionarLivro")
    public ResponseEntity adicionarLivro(@RequestBody LivroRestModel restModel) {

        LivroModel model = this.livrosModelToRestModelConverter.convertToEntity(restModel);

        this.adicionarLivroUseCase.execute(model);

        return ResponseEntity.ok().body(restModel);
    }

    @Override
    @DeleteMapping(value = "/deletarLivro")
    public ResponseEntity deletarLivro(@RequestBody DeletarLivroRestModel restModel) {

        this.deletarLivroUseCase.execute(restModel.titulo());

        return ResponseEntity.ok().build();
    }


}
