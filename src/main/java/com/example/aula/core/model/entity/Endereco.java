package com.example.aula.core.model.entity;

import javax.persistence.Column;
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
public class Endereco extends AbstractEntity {
	@Column
	private String rua;

	@Column
	private String bairro;

	@Column
	private String complemento;

	@Column
	private String cidadeEstado;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "pessoa_id")
	@NotNull
	private Pessoa pessoa;
}
