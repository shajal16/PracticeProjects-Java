package com.kamal.hatchwayassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HatchwayAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HatchwayAssessmentApplication.class, args);
	}

}
