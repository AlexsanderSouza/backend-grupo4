package com.example.aula.service;

import java.util.List;

import com.example.aula.core.model.entity.Endereco;

public interface EnderecoService {
	public List<Endereco> findByPessoaId(Long idPessoa);

	public Endereco save(Endereco endereco);
}
