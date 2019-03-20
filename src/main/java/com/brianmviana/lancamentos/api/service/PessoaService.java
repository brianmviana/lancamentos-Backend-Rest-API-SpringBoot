package com.brianmviana.lancamentos.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brianmviana.lancamentos.api.model.Pessoa;
import com.brianmviana.lancamentos.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa criar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public Pessoa buscarPeloCodigo(Long codigo) {
		return pessoaRepository.findOne(codigo);
	}
}
