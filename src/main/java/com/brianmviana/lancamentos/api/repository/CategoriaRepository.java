package com.brianmviana.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brianmviana.lancamentos.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
