package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Alocacao;
import com.example.aula.core.model.repository.AlocacaoRepository;
import com.example.aula.service.AlocacaoService;

@Service
public class AlocacaoServiceImpl implements AlocacaoService {

	@Autowired
	AlocacaoRepository alocacaoRepository;

	@Override
	public List<Alocacao> findByTarefaId(Long idTarefa) {
		return this.alocacaoRepository.findByTarefaId(idTarefa);
	}

	@Override
	public Alocacao save(Alocacao alocacao) {

		alocacao = this.alocacaoRepository.save(alocacao);

		return alocacao;
	}

	@Override
	public List<Alocacao> findByPessoaId(Long idPessoa) {
		System.out.println(this.alocacaoRepository.findByPessoaId(idPessoa));
		return this.alocacaoRepository.findByPessoaId(idPessoa);
	}

	@Override
	public void delete(Long id) {
		this.alocacaoRepository.deleteById(id);
	}

}
