package com.brianmviana.lancamentos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brianmviana.lancamentos.api.model.Lancamento;
import com.brianmviana.lancamentos.api.model.Pessoa;
import com.brianmviana.lancamentos.api.repository.LancamentoRepository;
import com.brianmviana.lancamentos.api.repository.PessoaRepository;
import com.brianmviana.lancamentos.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaReporsitory;
	
	public List<Lancamento> listar(){
		return lancamentoRepository.findAll();
	}

	public Lancamento criar(Lancamento lancamento){
		Pessoa pessoa = pessoaReporsitory.findOne(lancamento.getPessoa().getCodigo());
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}
	
	public Lancamento buscarPeloCodigo(Long codigo) {
		return lancamentoRepository.findOne(codigo);
	}
	
	public void deletar(Long codigo) {
		lancamentoRepository.delete(codigo);
	}
}
