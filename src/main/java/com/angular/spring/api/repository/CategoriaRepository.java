package com.angular.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.spring.api.model.Categoria;



public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
