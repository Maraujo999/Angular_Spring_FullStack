package com.angular.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.spring.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

	

}
