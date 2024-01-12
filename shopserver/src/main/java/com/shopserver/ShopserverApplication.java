package com.shopserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopserverApplication.class, args);
	}

}
