package com.example.aula.core.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pessoa")
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa extends AbstractEntity {
	/** cria coluna nome na tabela pessoa */
	@Column()
	private String nome;

	/** cria coluna email na tabela pessoa */
	@Column
	private String email;
	
}
