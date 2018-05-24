package com.example.aula.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula.controller.EnderecoController;
import com.example.aula.core.model.entity.Endereco;
import com.example.aula.service.EnderecoService;

import reactor.core.publisher.Mono;

@RestController
public class EnderecoControllerImpl implements EnderecoController {

	@Autowired
	EnderecoService enderecoService;

	@Override
	public Mono<List<Endereco>> getEnderecosDaPessoa(@PathVariable Long idPessoa) {
		return Mono.just(this.enderecoService.findByPessoaId(idPessoa));
	}

	@Override
	public Mono<Endereco> saveEndereco(@RequestBody Endereco endereco) {
		endereco = this.enderecoService.save(endereco);

		return Mono.just(endereco);
	}
}
