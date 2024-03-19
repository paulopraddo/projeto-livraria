package com.livraria.Livraria.livros.app.livros.entrypoints;

import com.livraria.Livraria.livros.app.livros.restModels.AlterarLivroRestModel;
import com.livraria.Livraria.livros.app.livros.restModels.BuscarLivroRestModel;
import com.livraria.Livraria.livros.app.livros.restModels.DeletarLivroRestModel;
import com.livraria.Livraria.livros.app.livros.restModels.LivroRestModel;
import com.livraria.Livraria.livros.domain.livros.converters.LivrosModelToRestModelConverter;
import com.livraria.Livraria.livros.domain.livros.models.LivroModel;
import com.livraria.Livraria.livros.domain.livros.useCases.AdicionarLivroUseCase;
import com.livraria.Livraria.livros.domain.livros.useCases.AlterarLivroUseCase;
import com.livraria.Livraria.livros.domain.livros.useCases.BuscarLivroUseCase;
import com.livraria.Livraria.livros.domain.livros.useCases.BuscarTodosOsLivrosUseCase;
import com.livraria.Livraria.livros.domain.livros.useCases.DeletarLivroUseCase;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/livros")
@AllArgsConstructor
public class LivrosController implements LivrosResource{

    private final BuscarTodosOsLivrosUseCase buscarTodosOsLivrosUseCase;
    private final BuscarLivroUseCase buscarLivroUseCase;
    private final AdicionarLivroUseCase adicionarLivroUseCase;
    private final DeletarLivroUseCase deletarLivroUseCase;
    private final AlterarLivroUseCase alterarLivroUseCase;
    private final LivrosModelToRestModelConverter livrosModelToRestModelConverter;

    @Override
    @GetMapping
    public List<LivroModel> buscarTodosOsLivros() {

        return this.buscarTodosOsLivrosUseCase.execute();
    }

    @Override
    @GetMapping(value = "/buscarLivro")
    public LivroRestModel buscarLivro(@RequestBody BuscarLivroRestModel restModel) {

        LivroModel model = this.buscarLivroUseCase.execute(restModel.titulo());

        return this.livrosModelToRestModelConverter.convertToDto(model);
    }

    @Override
    @PostMapping(value = "/adicionarLivro")
    public ResponseEntity<Object> adicionarLivro(@RequestBody LivroRestModel restModel) {

        LivroModel model = this.livrosModelToRestModelConverter.convertToEntity(restModel);

        this.adicionarLivroUseCase.execute(model);

        return ResponseEntity.ok().body(restModel);
    }

    @Override
    @DeleteMapping(value = "/deletarLivro")
    public ResponseEntity<Object> deletarLivro(@RequestBody DeletarLivroRestModel restModel) {

        this.deletarLivroUseCase.execute(restModel.titulo());

        return ResponseEntity.ok().build();
    }

    @Override
    @PutMapping(value = "/alterarLivro")
    public ResponseEntity<Object> alterarLivro(@RequestBody AlterarLivroRestModel restModel) {
        
        this.alterarLivroUseCase.execute(restModel);

        return ResponseEntity.ok().build();

    }


}
