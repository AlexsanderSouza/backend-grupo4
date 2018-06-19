package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Alocacao;
import com.example.aula.core.model.entity.Pessoa;
import com.example.aula.core.model.repository.AlocacaoRepository;
import com.example.aula.core.model.repository.PessoaRepository;
import com.example.aula.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {
	
	/** injeta as dependências nesta classe */
	@Autowired
	PessoaRepository pessoaRepository;
	
	/** injeta as dependências nesta classe */
	@Autowired
	AlocacaoRepository alocacaoRepository;
	
	/** implementa a listagem de pessoas */
	@Override
	public List<Pessoa> getAll() {
		return this.pessoaRepository.findAll();
	}
	
	/** implementa o salvamento de pessoas no banco */
	@Override
	public Pessoa save(Pessoa pessoa) {
		pessoa = this.pessoaRepository.save(pessoa);
		return pessoa;
	}
	
	/** implementa o remoção de pessoa do banco e remove primeiro alocações feitas*/
	@Override
	public void delete(Long pessoaID) {
		List<Alocacao> alocacao = alocacaoRepository.findByPessoaId(pessoaID);
		this.alocacaoRepository.deleteAll(alocacao);
		this.pessoaRepository.deleteById(pessoaID);
	}
	/** implementa o edição de pessoa do banco */
	@Override
	public Pessoa edit(Pessoa pessoa) {
		pessoa = this.pessoaRepository.save(pessoa);
		return pessoa;
	}

}
