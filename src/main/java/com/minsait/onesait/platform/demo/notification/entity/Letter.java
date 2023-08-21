/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.minsait.onesait.platform.client.springboot.aspect.notifier.OPEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "letter")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@OPEntity
public class Letter {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include
	@JsonProperty(required = true)
	private UUID id;

	@Column(name = "task_type", length = 100)
	private String taskType;

	@Column(name = "task_select_attribute", length = 50)
	private String taskSelectAttribute;

	@Column(name = "task_select_value", length = 100)
	private String taskSelectValue;

	@Column(name = "report_id", length = 50)
	private String reportId;

	@OneToMany(mappedBy = "letter", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JsonManagedReference
	private final Set<LetterAttributes> letterAttributes = new HashSet<>();

}