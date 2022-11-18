package com.consumerestusingopenfeign.OpenFeignRestClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.consumerestusingopenfeign.OpenFeignRestClient.proxy")
public class OpenFeignRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignRestClientApplication.class, args);
	}

}
