package com.brianmviana.lancamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brianmviana.lancamentos.api.model.Lancamento;
import com.brianmviana.lancamentos.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
