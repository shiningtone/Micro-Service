package com.shsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 * Created by administer on 2017/10/12.
            */
    @SpringBootApplication
    @EnableDiscoveryClient
    public class Application {
        public static void main(String[] args) {
            SpringApplication.run(Application.class);
        }
    @LoadBalanced
    @Bean
    RestTemplate restTemplate()
    {
        return  new RestTemplate();
    }
}
