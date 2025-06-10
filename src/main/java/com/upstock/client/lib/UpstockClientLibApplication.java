package com.upstock.client.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class UpstockClientLibApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpstockClientLibApplication.class, args);
	}

}
