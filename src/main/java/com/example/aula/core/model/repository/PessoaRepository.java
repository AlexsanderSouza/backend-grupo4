package com.example.aula.core.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aula.core.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
