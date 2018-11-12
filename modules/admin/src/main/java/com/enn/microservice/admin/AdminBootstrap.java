package com.enn.microservice.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.enn.microservice.auth.client.EnableAceAuthClient;
import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * ${DESCRIPTION}
 *
 * @author hanyilong
 * @create 2017-05-25 12:44
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableFeignClients({"com.enn.microservice.auth.client.feign"})
@EnableScheduling
@EnableAceAuthClient
@EnableTransactionManagement
@MapperScan("com.enn.microservice.admin.mapper")
@EnableSwagger2Doc
public class AdminBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminBootstrap.class).web(true).run(args);    }
}
