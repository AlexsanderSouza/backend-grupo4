package com.example.aula.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.aula.core.model.entity.Tarefa;

import reactor.core.publisher.Mono;

@RequestMapping("/tarefa")
public interface TarefaController {

	/** retorna lista de tarefas do banco */
	@GetMapping("/all")
	Mono<List<Tarefa>> getTarefas();
	
	/** Salva tarefa no banco */
	@PostMapping("/save")
	Mono<Tarefa> saveTarefa(@RequestBody Tarefa tarefa);
	
	/** deleta tarefa no banco */
	@DeleteMapping("/delete")
	void deleteTarefa(@RequestParam("params") Long tarefa);
	
	/** edita tarefa no banco */
	@PutMapping("/edit")
	Mono<Tarefa> editTarefa(@RequestBody Tarefa tarefa);


}


