package com.brianmviana.lancamentos.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brianmviana.lancamentos.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmail(String email);
	
}
