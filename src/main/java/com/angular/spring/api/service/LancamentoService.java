package com.angular.spring.api.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.spring.api.model.Lancamento;
import com.angular.spring.api.model.Pessoa;
import com.angular.spring.api.repository.LancamentoRepository;
import com.angular.spring.api.repository.PessoaRepository;
import com.angular.spring.api.service.exception.PessoaInexistenteOuInativaException;


@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;



	public Lancamento salvar(Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
		
		Pessoa pessoa1 = new Pessoa();
		if (pessoa1 == null || pessoa1.getAtivo() != true ) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}

	

}
