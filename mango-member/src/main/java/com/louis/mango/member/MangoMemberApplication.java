package com.louis.mango.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.louis.mango"})
class MangoMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoMemberApplication.class, args);
	}

}

