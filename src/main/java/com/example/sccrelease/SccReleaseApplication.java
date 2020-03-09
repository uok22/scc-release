package com.example.sccrelease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;


@EnableStubRunnerServer
@SpringBootApplication
public class SccReleaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccReleaseApplication.class, args);
	}

}
