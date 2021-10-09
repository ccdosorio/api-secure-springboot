package com.christian.apirestsecure.persistence.crud;

import com.christian.apirestsecure.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {
    List<Categoria> findByEstado(boolean estado);
}
