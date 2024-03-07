package com.livraria.Livraria.useCase;

import com.livraria.Livraria.entity.LivroModel;
import org.springframework.http.ResponseEntity;

public interface AdicionarLivroUseCase {
    LivroModel execute(LivroModel model);
}
