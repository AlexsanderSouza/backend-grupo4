package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Pessoa;
import com.example.aula.core.model.repository.PessoaRepository;
import com.example.aula.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;

	@Override
	public List<Pessoa> getAll() {
		return this.pessoaRepository.findAll();
	}

	@Override
	public Pessoa save(Pessoa pessoa) {

		pessoa = this.pessoaRepository.save(pessoa);

		return pessoa;
	}

}
