/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.entity;

import java.util.UUID;

import com.minsait.onesait.platform.client.springboot.aspect.notifier.OPEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bpm_process_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@OPEntity
public class BpmProcessType {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	@EqualsAndHashCode.Include
	private UUID id;

	@Column(name = "identifier", length = 100, nullable = true)
	private String identifier;

	@Column(name = "process_definition", length = 100, nullable = true)
	private String processDefinition;

	/*
	 * @OneToMany(mappedBy = "bpmProcessType", cascade = CascadeType.ALL,
	 * orphanRemoval = true, fetch = FetchType.EAGER) private
	 * List<BpmProcessVariable> bpmProcessVariables = new ArrayList<>();
	 */

}
