package com.livraria.Livraria.controller;

import com.livraria.Livraria.converters.LivrosModelToRestModelConverter;
import com.livraria.Livraria.entity.LivroModel;
import com.livraria.Livraria.restModels.LivroRestModel;
import com.livraria.Livraria.useCase.AdicionarLivroUseCase;
import com.livraria.Livraria.useCase.BuscarTodosOsLivrosUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@AllArgsConstructor
public class LivrosController implements LivrosResource{

    private final BuscarTodosOsLivrosUseCase buscarTodosOsLivrosUseCase;
    private final AdicionarLivroUseCase adicionarLivroUseCase;
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


}
