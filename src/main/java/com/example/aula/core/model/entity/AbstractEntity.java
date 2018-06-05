package com.example.aula.core.model.entity;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

@Component
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Wither(AccessLevel.NONE)
public @Data abstract class AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public AbstractEntity(Long id) {
		this.id = id;
	}
	
	public AbstractEntity() {
		
	}
}
