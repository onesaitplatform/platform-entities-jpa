/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.entity;

import java.util.UUID;

import com.minsait.onesait.platform.client.springboot.aspect.notifier.OPEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@OPEntity
public class Task {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	@EqualsAndHashCode.Include
	private UUID id;

	@Column(name = "task_identifier", length = 100, nullable = true)
	private String taskIdentifier;

	@ManyToOne
	@JoinColumn(name = "bpm_process_type_id", nullable = false, foreignKey = @ForeignKey(name = "fk_task_bpm_process_type"))
	private BpmProcessType bpmProcessTypeId;

	@Column(name = "bpm_process_id", length = 100, nullable = true)
	private String bpmProcessId;

//	@ManyToOne
//	@JoinColumn(name = "task_tray_id",nullable = false,foreignKey = @ForeignKey(name="fk_task_tray_id"))
//	private TaskTray taskTrayId;

	@Column
	private Boolean active;

	public Task(UUID id) {
		super();
		this.id = id;
	}
}
