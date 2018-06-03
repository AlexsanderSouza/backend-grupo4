package com.example.aula.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula.core.model.entity.Endereco;
import com.example.aula.core.model.repository.EnderecoRepository;
import com.example.aula.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	EnderecoRepository enderecoRepository;

	@Override
	public List<Endereco> findByPessoaId(Long idPessoa) {
		return this.enderecoRepository.findByPessoaId(idPessoa);
	}

	@Override
	public Endereco save(Endereco endereco) {
		System.out.println("Endereco");
		System.out.println(endereco);

		endereco = this.enderecoRepository.save(endereco);

		return endereco;
	}

}
