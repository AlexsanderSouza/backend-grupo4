package com.example.aula.core.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.aula.core.model.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
}

