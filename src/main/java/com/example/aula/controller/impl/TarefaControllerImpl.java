package com.example.aula.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula.controller.TarefaController;
import com.example.aula.core.model.entity.Tarefa;
import com.example.aula.service.TarefaService;

import reactor.core.publisher.Mono;

@RestController
public class TarefaControllerImpl implements TarefaController {

	@Autowired
	TarefaService tarefaService;

	@Override
	public Mono<List<Tarefa>> getTarefas() {
		List<Tarefa> listaTarefas = this.tarefaService.getAll();
		System.out.println("lista");
		System.out.println(listaTarefas);
		return Mono.just(listaTarefas);
	}

	@Override
	public Mono<Tarefa> saveTarefa(@RequestBody Tarefa tarefa) {
		tarefa = this.tarefaService.save(tarefa);

		return Mono.just(tarefa);
	}
	
	@Override
	public void deleteTarefa(@RequestParam("params") Long tarefaID) {
		System.out.println(tarefaID);
		this.tarefaService.delete(tarefaID);

	}
	
	@Override
	public Mono<Tarefa> editTarefa(@RequestBody Tarefa tarefa) {
		tarefa = this.tarefaService.edit(tarefa);

		return Mono.just(tarefa);
	}
}

