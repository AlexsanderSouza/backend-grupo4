package com.example.aula.core.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula.core.model.entity.Alocacao;

public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {
	
	/** retorna alocações que possui o id da tarefa passado */
	List<Alocacao> findByTarefaId(Long idTarefa);
	
	/** retorna alocações que possui o id da pessoa passado */
	List<Alocacao> findByPessoaId(Long idPessoa);
}
