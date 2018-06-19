package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Alocacao;
import com.example.aula.core.model.repository.AlocacaoRepository;
import com.example.aula.service.AlocacaoService;

@Service
public class AlocacaoServiceImpl implements AlocacaoService {
	
	/** injeta as dependências nesta classe */
	@Autowired
	AlocacaoRepository alocacaoRepository;
	
	/** sobrescreve a listagem de tarefa com procura por id de tarefa */
	@Override
	public List<Alocacao> findByTarefaId(Long idTarefa) {
		return this.alocacaoRepository.findByTarefaId(idTarefa);
	}
	/** implementa o salvamento de alocação */
	@Override
	public Alocacao save(Alocacao alocacao) {
		alocacao = this.alocacaoRepository.save(alocacao);
		return alocacao;
	}
	/** implementa a listagem de tarefa com procura por id de Pessoa */
	@Override
	public List<Alocacao> findByPessoaId(Long idPessoa) {
		return this.alocacaoRepository.findByPessoaId(idPessoa);
	}
	/** deleta alocação */
	@Override
	public void delete(Long id) {
		this.alocacaoRepository.deleteById(id);
	}

}
