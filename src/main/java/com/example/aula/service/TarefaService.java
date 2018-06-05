package com.example.aula.service;

import com.example.aula.core.model.entity.Tarefa;
import java.util.List;

public interface TarefaService {

	public List<Tarefa> getAll();

	public Tarefa save(Tarefa tarefa);
	
	public void delete(Long tarefaID);
	
	public Tarefa edit(Tarefa tarefa);
}

