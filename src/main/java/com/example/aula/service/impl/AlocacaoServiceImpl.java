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
	AlocacaoRepository enderecoRepository;

	@Override
	public List<Alocacao> findByTarefaId(Long idPessoa) {
		return this.enderecoRepository.findByPessoaId(idPessoa);
	}

	@Override
	public Alocacao save(Alocacao endereco) {
		System.out.println("Endereco");
		System.out.println(endereco);

		endereco = this.enderecoRepository.save(endereco);

		return endereco;
	}

}
