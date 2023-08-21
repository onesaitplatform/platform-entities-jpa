/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.enums;

public enum EnumTypeTrayAuthorization {

	USER("USER"), GROUP("GROUP");

	private final String text;

	/**
	 * @param text
	 */
	EnumTypeTrayAuthorization(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

}
