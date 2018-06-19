package com.example.aula.service;

import java.util.List;

import com.example.aula.core.model.entity.Alocacao;

public interface AlocacaoService {
	
	/** Lista alocação por id de tarefa */
	public List<Alocacao> findByTarefaId(Long idTarefa);
	
	/** LIsta alocação por id de pessoa */
	public List<Alocacao> findByPessoaId(Long idPessoa);
	
	/** Salva alocação */
	public Alocacao save(Alocacao alocacao);
	
	/** remove uma alocação */
	public void delete(Long id);
}
