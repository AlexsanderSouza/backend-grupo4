package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Alocacao;
import com.example.aula.core.model.entity.Tarefa;
import com.example.aula.core.model.repository.AlocacaoRepository;
import com.example.aula.core.model.repository.TarefaRepository;
import com.example.aula.service.TarefaService;

@Service
public class TarefaServiceImpl implements TarefaService {

	/** injeta as dependências nesta classe */
	@Autowired
	TarefaRepository tarefaRepository;

	/** injeta as dependências nesta classe */
	@Autowired
	AlocacaoRepository alocacaoRepository;

	/** implementa a listagem de pessoas */
	@Override
	public List<Tarefa> getAll() {
		return this.tarefaRepository.findAll();
	}

	/** implementa o salvamento de tarefas no banco */
	@Override
	public Tarefa save(Tarefa tarefa) {

		tarefa = this.tarefaRepository.save(tarefa);

		return tarefa;
	}

	/**
	 * implementa o remoção de tarefa do banco e remove primeiro alocações feitas
	 */
	@Override
	public void delete(Long tarefaID) {
		List<Alocacao> alocacao = alocacaoRepository.findByTarefaId(tarefaID);
		this.alocacaoRepository.deleteAll(alocacao);
		this.tarefaRepository.deleteById(tarefaID);
	}

	/** implementa o edição de tarefa do banco */
	@Override
	public Tarefa edit(Tarefa tarefa) {

		tarefa = this.tarefaRepository.save(tarefa);

		return tarefa;
	}

}
