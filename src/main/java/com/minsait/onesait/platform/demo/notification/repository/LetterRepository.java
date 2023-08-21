/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minsait.onesait.platform.demo.notification.entity.Letter;

public interface LetterRepository extends JpaRepository<Letter, UUID> {
}
