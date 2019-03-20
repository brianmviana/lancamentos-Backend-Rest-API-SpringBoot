package com.brianmviana.lancamentos.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brianmviana.lancamentos.api.model.Categoria;
import com.brianmviana.lancamentos.api.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}

	public Categoria criar(Categoria categoria){
		return categoriaRepository.save(categoria);
	}
	
	public Categoria buscarPeloCodigo(Long codigo) {
		return categoriaRepository.findOne(codigo);
	}
}
