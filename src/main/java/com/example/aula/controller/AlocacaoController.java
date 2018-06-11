package com.example.aula.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.aula.core.model.entity.Alocacao;

import reactor.core.publisher.Mono;

@RequestMapping("/alocacao")
public interface AlocacaoController {

	@GetMapping("/pessoa-by-tarefa/{idPessoa}")
	Mono<List<Alocacao>> getTarefaDaPessoa(@PathVariable Long idPessoa);
	
	@GetMapping("/tarefa-by-pessoa/{idTarefa}")
	Mono<List<Alocacao>> getPessoaDaTarefa(@PathVariable Long idTarefa);

	@PostMapping("/save")
	Mono<Alocacao> saveAlocacao(@RequestBody Alocacao alocacao);
	
	@DeleteMapping("/delete")
	void deleteAlocacao(@RequestParam("params") Long id);

}
