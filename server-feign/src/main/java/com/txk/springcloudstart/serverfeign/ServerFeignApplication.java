package com.txk.springcloudstart.serverfeign;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = "com.txk.springcloudstart.dao")
public class ServerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerFeignApplication.class, args);
	}

}
