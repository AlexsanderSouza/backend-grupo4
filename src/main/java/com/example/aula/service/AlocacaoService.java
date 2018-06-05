package com.example.aula.service;

import java.util.List;

import com.example.aula.core.model.entity.Alocacao;

public interface AlocacaoService {
	public List<Alocacao> findByTarefaId(Long idTarefa);

	public Alocacao save(Alocacao alocacao);
}
