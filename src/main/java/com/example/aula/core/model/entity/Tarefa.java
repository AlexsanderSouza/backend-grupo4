package com.example.aula.core.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Table(name="tarefa")
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tarefa extends AbstractEntity {
	/** cria coluna titulo na tabela tarefa */
	@Column
	private String titulo;
	
	/** cria coluna escrição na tabela tarefa */
	@Column
	private String descricao;
	
	/** cria coluna dtIni na tabela tarefa */
	@Column
	private LocalDate dtIni;
	/** cria coluna dtFim na tabela tarefa */
	
	@Column
	private LocalDate dtFim;
	
	
}

