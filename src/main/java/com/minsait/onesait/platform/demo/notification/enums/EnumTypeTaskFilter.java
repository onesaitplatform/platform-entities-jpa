/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.enums;

public enum EnumTypeTaskFilter {
	ENTITY("ENTITY"), BPM_PROPERTY("BPM_PROPERTY"), BPM_VARIABLE("BPM_VARIABLE");

	private final String text;

	/**
	 * @param text
	 */
	EnumTypeTaskFilter(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
