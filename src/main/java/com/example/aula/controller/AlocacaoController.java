package com.example.aula.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.aula.core.model.entity.Alocacao;

import reactor.core.publisher.Mono;

@RequestMapping("/alocacao")
public interface AlocacaoController {

	@GetMapping("/pessoa-by-tarefa/{idTarefa}")
	Mono<List<Alocacao>> getTarefaDaPessoa(@PathVariable Long idTarefa);

	@PostMapping("/save")
	Mono<Alocacao> saveAlocacao(@RequestBody Alocacao alocacao);

}
