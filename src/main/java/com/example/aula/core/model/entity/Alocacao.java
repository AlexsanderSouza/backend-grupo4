package com.example.aula.core.model.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Alocacao extends AbstractEntity {
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "tarefa_id", referencedColumnName="id")
	@NotNull
	private Tarefa tarefa;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "pessoa_id", referencedColumnName="id")
	@NotNull
	private Pessoa pessoa;
}
