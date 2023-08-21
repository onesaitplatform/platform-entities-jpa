/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.enums;

public enum EnumTypeTaskTray {
	LIST("LIST"), CAROUSEL("CAROUSEL"), LISTFORM("LISTFORM");

	private final String text;

	/**
	 * @param text
	 */
	EnumTypeTaskTray(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

}
