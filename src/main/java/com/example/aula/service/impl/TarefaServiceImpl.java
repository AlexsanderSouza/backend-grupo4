package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Tarefa;
import com.example.aula.core.model.repository.TarefaRepository;
import com.example.aula.service.TarefaService;

@Service
public class TarefaServiceImpl implements TarefaService {

	@Autowired
	TarefaRepository tarefaRepository;

	@Override
	public List<Tarefa> getAll() {
		System.out.println("Tarefa");
		System.out.println(this.tarefaRepository.findAll());
		return this.tarefaRepository.findAll();
	}

	@Override
	public Tarefa save(Tarefa tarefa) {

		tarefa = this.tarefaRepository.save(tarefa);

		return tarefa;
	}
	
	@Override
	public void delete(Long tarefaID) {

		 this.tarefaRepository.deleteById(tarefaID);
	}
	
	@Override
	public Tarefa edit(Tarefa tarefa) {

		tarefa = this.tarefaRepository.save(tarefa);

		return tarefa;
	}

}

