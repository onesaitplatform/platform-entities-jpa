/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.minsait.onesait.platform.demo.notification.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, UUID> {
	<S extends Claim> S save(S entity);

	<S extends Claim> Optional<S> findById(UUID id);

	@Query("SELECT c FROM Claim c WHERE c.active = :active")
	Optional<List<Claim>> findClaimByActive(@Param("active") Boolean active);
}
