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

	@Column
	private String titulo;

	@Column
	private String descricao;
	
	@Column
	private LocalDate inicioDate;
	
	@Column
	private LocalDate fimDate;
	
	
}

