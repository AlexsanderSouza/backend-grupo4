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

	/** retorna lista de alocação que contém  id de pessoa passado na url */
	@GetMapping("/pessoa-by-tarefa/{idPessoa}")
	Mono<List<Alocacao>> getTarefaDaPessoa(@PathVariable Long idPessoa);
	
	/** retorna lista de alocação que contém id de tarefa passado na url */
	@GetMapping("/tarefa-by-pessoa/{idTarefa}")
	Mono<List<Alocacao>> getPessoaDaTarefa(@PathVariable Long idTarefa);
	
	/** salva a alocação recebida no banco */
	@PostMapping("/save")
	Mono<Alocacao> saveAlocacao(@RequestBody Alocacao alocacao);
	
	/** deleta a alocação recebida, do banco */
	@DeleteMapping("/delete")
	void deleteAlocacao(@RequestParam("params") Long id);

}
