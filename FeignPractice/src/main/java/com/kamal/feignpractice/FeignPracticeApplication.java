package com.kamal.feignpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignPracticeApplication.class, args);
	}

}
