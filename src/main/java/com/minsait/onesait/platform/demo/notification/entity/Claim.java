/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.entity;

import java.time.LocalDateTime;
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
import lombok.ToString;

@Entity
@Table(name = "claim")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@OPEntity
public class Claim {

	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, nullable = false)
	@EqualsAndHashCode.Include
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "task_id", nullable = false, foreignKey = @ForeignKey(name = "fk_claim_task"))
	private Task task;

	@Column(name = "case_number", nullable = true, unique = true, length = 100)
	private String caseNumber;

	@Column(name = "case_owner", nullable = true, length = 80)
	private String caseOwner;

	@Column(name = "opening_date", nullable = true, length = 80)
	private LocalDateTime openingDate;

	@Column(name = "contract", nullable = true, length = 80)
	private String contract;

	@Column(name = "contract_request", nullable = true, length = 80)
	private String contractRequest;

	@Column(name = "supply_point", nullable = true, length = 50)
	private String supplyPoint;

	@Column(name = "owner_company", nullable = true, length = 80)
	private String ownerCompany;

	@Column(name = "client_vision_type", nullable = true, length = 80)
	private String clientVisionType;

	@Column(name = "client_vision_subtype", nullable = true, length = 100)
	private String clientVisionSubtype;

	@Column(name = "presentation_way", nullable = true, length = 100)
	private String presentationWay;

	@Column(name = "reception_date", nullable = true)
	private LocalDateTime receptionDate;

	@Column(name = "limit_end_date")
	private LocalDateTime limitEndDate;

	@Column(name = "intermediary_type", nullable = true, length = 100)
	private String intermediaryType;

	@Column(name = "intermediary_complete_name", nullable = true, length = 150)
	private String intermediaryCompleteName;

	@Column(name = "intermediary_address", nullable = true, length = 150)
	private String intermediaryAddress;

	@Column(name = "intermediary_file", nullable = true, length = 150)
	private String intermediaryFile;

	@Column(name = "client_nif", nullable = true, length = 20)
	private String clientNif;

	@Column(name = "client", nullable = true, length = 100)
	private String client;

	@Column(name = "business_line", length = 100, nullable = true)
	private String businessLine;

	@Column(name = "status_salesforce", length = 100, nullable = true)
	private String statusSalesforce;

	@Column(name = "status_internal", length = 100, nullable = true)
	private String statusInternal;

	@Column(name = "mark_type", length = 100, nullable = true)
	private String markType;

	@Column(name = "distributor", length = 100, nullable = true)
	private String distributor;

	@Column(name = "close_date", nullable = true)
	private LocalDateTime closeDate;

	@Column(name = "result", length = 100, nullable = true)
	private String result;

	@Column(name = "cause", length = 100, nullable = true)
	private String cause;

	@Column
	private Boolean active;

	@Column(name = "max_finish_date")
	private LocalDateTime maxFinishDate;

	public Claim(UUID id) {
		super();
		this.id = id;
	}

}
