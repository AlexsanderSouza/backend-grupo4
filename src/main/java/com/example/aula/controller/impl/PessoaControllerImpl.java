package com.example.aula.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula.controller.PessoaController;
import com.example.aula.core.model.entity.Pessoa;
import com.example.aula.service.PessoaService;

import reactor.core.publisher.Mono;

@RestController
public class PessoaControllerImpl implements PessoaController {

	@Autowired
	PessoaService pessoaService;

	@Override
	public Mono<List<Pessoa>> getPessoas() {
		List<Pessoa> listaAlunos = this.pessoaService.getAll();
		return Mono.just(listaAlunos);
	}

	@Override
	public Mono<Pessoa> savePessoa(@RequestBody Pessoa pessoa) {
		pessoa = this.pessoaService.save(pessoa);

		return Mono.just(pessoa);
	}
	
	@Override
	public void deletePessoa(@RequestParam("params") Long pessoaID) {
		this.pessoaService.delete(pessoaID);
	}
	
	@Override
	public Mono<Pessoa> editPessoa(@RequestBody Pessoa pessoa) {
		pessoa = this.pessoaService.edit(pessoa);

		return Mono.just(pessoa);
	}
}
