package com.minsait.onesait.platform.demo.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = { "com.minsait.onesait" })
public class DemoNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNotificationApplication.class, args);
	}

}
