package com.example.aula.core.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula.core.model.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	List<Endereco> findByPessoaId(Long idPessoa);
}
