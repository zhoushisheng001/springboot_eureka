package com.zhuguang.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//服务端用该注解
public class EurekaServerStart {
	
	public static void main(String[] args) {
		 SpringApplication.run(EurekaServerStart.class, args);  
	}

}
