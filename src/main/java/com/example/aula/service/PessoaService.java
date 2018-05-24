package com.example.aula.service;

import java.util.List;

import com.example.aula.core.model.entity.Pessoa;

public interface PessoaService {
	public List<Pessoa> getAll();

	public Pessoa save(Pessoa pessoa);
}
