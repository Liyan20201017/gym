package com.gym.springBootGateWay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.gym.springBootGateWay.dao")
@EnableFeignClients
@EnableScheduling
public class SpringBootGateWay {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGateWay.class,args);
    }
}
