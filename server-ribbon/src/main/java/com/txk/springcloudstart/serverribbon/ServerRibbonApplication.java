package com.txk.springcloudstart.serverribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableHystrix  //断路器注解开启断路器
public class ServerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/*@Value("${server.port}")
	String port;

	@RequestMapping("/")
	public String home(@RequestParam(value = "name", defaultValue = "txk") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}*/

}
