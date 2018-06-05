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
		System.out.println("tudo");
		System.out.println(this.pessoaRepository.findAll());
		return this.pessoaRepository.findAll();
	}

	@Override
	public Pessoa save(Pessoa pessoa) {

		pessoa = this.pessoaRepository.save(pessoa);

		return pessoa;
	}
	
	@Override
	public void delete(Long pessoaID) {

		 this.pessoaRepository.deleteById(pessoaID);

//		return pessoa;  //tanto faz
	}
	
	@Override
	public Pessoa edit(Pessoa pessoa) {

		pessoa = this.pessoaRepository.save(pessoa);

		return pessoa;
	}

}
