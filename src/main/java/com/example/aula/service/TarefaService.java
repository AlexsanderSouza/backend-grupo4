package com.example.aula.service;

import com.example.aula.core.model.entity.Tarefa;
import java.util.List;

public interface TarefaService {
	/** lista tarefas */
	public List<Tarefa> getAll();
	
	/** salva tarefa */
	public Tarefa save(Tarefa tarefa);
	
	/** apaga tarefa */
	public void delete(Long tarefaID);
	
	/** edita tarefa */
	public Tarefa edit(Tarefa tarefa);
}

