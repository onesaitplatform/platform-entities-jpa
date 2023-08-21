/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsait.onesait.platform.demo.notification.entity.Action;

public interface ActionRepository extends JpaRepository<Action, UUID> {
	@Override
	<S extends Action> S save(S entity);

	<S extends Action> Optional<S> findById(UUID id);

}
