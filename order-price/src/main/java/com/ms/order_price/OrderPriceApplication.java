package com.ms.order_price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPriceApplication.class, args);
	}

}
