package com.livraria.Livraria.utils.abstractClasses;

import java.util.List;
import java.util.stream.Collectors;

public abstract class ConvertCase<E, R> {

    public abstract R convertToDto(E entity);

    public abstract E convertToEntity(R dto);

    public List<R> convertToDtoList(List<E> entityList) {
        return entityList.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<E> convertToEntityList(List<R> dtoList) {
        return dtoList.stream()
                .map(this::convertToEntity)
                .collect(Collectors.toList());
    }
}