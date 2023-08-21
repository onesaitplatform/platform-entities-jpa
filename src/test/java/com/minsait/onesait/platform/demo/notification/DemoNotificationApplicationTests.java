package com.minsait.onesait.platform.demo.notification;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.minsait.onesait.platform.demo.notification.entity.BpmProcessType;
import com.minsait.onesait.platform.demo.notification.entity.Claim;
import com.minsait.onesait.platform.demo.notification.entity.Task;
import com.minsait.onesait.platform.demo.notification.repository.BpmProcessTypeRepository;
import com.minsait.onesait.platform.demo.notification.repository.TaskRepository;
import com.minsait.onesait.platform.demo.notification.service.BusinessService;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class DemoNotificationApplicationTests {

	@Autowired
	private BpmProcessTypeRepository bpmProcessTypeRepository;
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private BusinessService businessService;

	private static final ObjectMapper MAPPER = new ObjectMapper();

	@Test
	@Transactional
	void dummyData() {
		MAPPER.registerModule(new JavaTimeModule());
		final BpmProcessType type = new BpmProcessType();
		type.setIdentifier("TIPO_A");
		type.setProcessDefinition("proccessDef1");
		bpmProcessTypeRepository.save(type);

		final Task task = new Task();
		task.setBpmProcessId("Process1");
		task.setBpmProcessTypeId(type);
		task.setTaskIdentifier("Task1");
		task.setActive(true);
		taskRepository.save(task);

		final LocalDateTime rightNow = LocalDateTime.now();
		final Claim claim = new Claim();
		claim.setActive(true);
		claim.setBusinessLine("BussinessLine1");
		claim.setCaseNumber("Case1");
		claim.setCaseOwner("fjgcornejo");
		claim.setCause("Cause1");
		claim.setClient("Client1");
		claim.setClientNif("345454F");
		claim.setClientVisionSubtype("VisionST1");
		claim.setClientVisionType("VisionT1");
		claim.setCloseDate(rightNow);
		claim.setContract("Contract1");
		claim.setContractRequest("CRequest1");
		claim.setDistributor("Distributor1");
		claim.setIntermediaryAddress("Address1");
		claim.setIntermediaryCompleteName("Name1");
		claim.setIntermediaryFile("file1");
		claim.setIntermediaryType("Type1");
		claim.setLimitEndDate(rightNow);
		claim.setMarkType("mark1");
		claim.setMaxFinishDate(rightNow);
		claim.setOpeningDate(rightNow);
		claim.setOwnerCompany("Company1");
		claim.setPresentationWay("presentation1");
		claim.setReceptionDate(rightNow);
		claim.setResult("result1");
		claim.setStatusInternal("Status1");
		claim.setStatusSalesforce("Salesforce1");
		claim.setSupplyPoint("point1");
		claim.setTask(task);
		businessService.createClaim(claim);

	}

}
