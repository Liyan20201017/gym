package com.gym.SpringBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@MapperScan("com.gym.SpringBoot.dao")
@EnableDiscoveryClient
public class SpringBootProduct {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProduct.class,args);
    }
}