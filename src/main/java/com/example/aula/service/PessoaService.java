package com.example.aula.service;

import java.util.List;

import com.example.aula.core.model.entity.Pessoa;

public interface PessoaService {
	
	/** lista pessoas */
	public List<Pessoa> getAll();
	
	/** salva pessoas */
	public Pessoa save(Pessoa pessoa);
	
	/** remove pessoa */
	public void delete(Long pessoaID);
	
	/** edita uma pessoa */
	public Pessoa edit(Pessoa pessoa);
}
