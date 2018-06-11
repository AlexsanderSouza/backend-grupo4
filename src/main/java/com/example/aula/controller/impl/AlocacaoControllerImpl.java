package com.example.aula.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula.controller.AlocacaoController;
import com.example.aula.core.model.entity.Alocacao;
import com.example.aula.service.AlocacaoService;

import reactor.core.publisher.Mono;

@RestController
public class AlocacaoControllerImpl implements AlocacaoController {

	@Autowired
	AlocacaoService AlocacaoService;

	@Override
	public Mono<List<Alocacao>> getPessoaDaTarefa(@PathVariable Long idTarefa) {
		return Mono.just(this.AlocacaoService.findByTarefaId(idTarefa));
	}

	@Override
	public Mono<Alocacao> saveAlocacao(@RequestBody Alocacao tarefa) {
		tarefa = this.AlocacaoService.save(tarefa);

		return Mono.just(tarefa);
	}

	@Override
	public Mono<List<Alocacao>> getTarefaDaPessoa(Long idPessoa) {
		return Mono.just(this.AlocacaoService.findByTarefaId(idPessoa));
	}

	@Override
	public void deleteAlocacao(@RequestParam("params") Long id) {
		this.AlocacaoService.delete(id);
		
	}

}
