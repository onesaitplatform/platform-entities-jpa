/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "action")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@OPEntity
public class Action {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	@EqualsAndHashCode.Include
	@JsonProperty(required = true)
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "claim_id", foreignKey = @ForeignKey(name = "fk_action_claim"))
	private Claim claim;

	@Column(name = "case_number", nullable = false, length = 100)
	private String caseNumber;

	@Column(name = "management_type", nullable = true, length = 100)
	private String managementType;

	@Column(name = "management_subtype", nullable = true, length = 100)
	private String managementSubtype;

	@Column(name = "status", nullable = true, length = 100)
	private String status;

	@Column(name = "case_owner", nullable = true, length = 100)
	private String caseOwner;

	@Column(name = "team", nullable = true, length = 80)
	private String team;

	@Column(name = "opening_date", nullable = true)
	private String openingDate;

	@Column(name = "close_date", nullable = true)
	private String closeDate;

	@Column
	private Boolean active;
}
