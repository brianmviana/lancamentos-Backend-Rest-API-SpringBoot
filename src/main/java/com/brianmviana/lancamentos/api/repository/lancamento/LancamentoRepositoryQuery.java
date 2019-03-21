package com.brianmviana.lancamentos.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.brianmviana.lancamentos.api.model.Lancamento;
import com.brianmviana.lancamentos.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
