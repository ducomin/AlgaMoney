package com.algaworks.algaMoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algaMoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
