package com.example.aula.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.aula.core.model.entity.Endereco;

import reactor.core.publisher.Mono;

@RequestMapping("/endereco")
public interface EnderecoController {

	@GetMapping("/enderecos-by-pessoa/{idPessoa}")
	Mono<List<Endereco>> getEnderecosDaPessoa(@PathVariable Long idPessoa);

	@PostMapping("/save")
	Mono<Endereco> saveEndereco(@RequestBody Endereco endereco);

}
