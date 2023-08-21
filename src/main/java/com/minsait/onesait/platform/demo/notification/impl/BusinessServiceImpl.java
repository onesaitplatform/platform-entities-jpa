package com.minsait.onesait.platform.demo.notification.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minsait.onesait.platform.client.enums.OperationType;
import com.minsait.onesait.platform.client.springboot.aspect.notifier.OPNotifierOperation;
import com.minsait.onesait.platform.client.springboot.aspect.notifier.OPValidateSchema;
import com.minsait.onesait.platform.demo.notification.entity.Claim;
import com.minsait.onesait.platform.demo.notification.repository.ClaimRepository;
import com.minsait.onesait.platform.demo.notification.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private ClaimRepository claimRepository;

	@Override
	@OPNotifierOperation(async = true, ontology = "Claim", operationType = OperationType.INSERT)
	public void createClaim(@OPValidateSchema Claim claim) {
		claimRepository.save(claim);
	}

}
