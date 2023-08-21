/**
 * Copyright Indra Soluciones Tecnologías de la Información, S.L.U.
 * 2023-2023 SPAIN
 */
package com.minsait.onesait.platform.demo.notification.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ConvertToPageable {

	/**
	 * Pageable by number of elements and page to filter.
	 *
	 * @param Number of elements for page
	 * @param Name   of the page
	 * @return
	 */
	public Pageable getPageableProfile(int numElementsByPag, int pag) {

		// valores por defecto
		Pageable pageable = null;
		int page = 0;
		int numElementsByPage = 5;

		if (page != -1) {
			page = pag;
		}

		if (numElementsByPag != -1) {
			numElementsByPage = numElementsByPag;
		}

		pageable = PageRequest.of(page, numElementsByPage);

		return pageable;
	}// end getPageableProfile
}
