package com.d2c.shop.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * VM options: -Dspring.profiles.active=dev -Des.set.netty.runtime.available.processors=false
 */
@SpringBootApplication(scanBasePackages = "com.d2c")
public class CustomerApplication {

    // VM options 解决整合Redis,Mongodb,Elasticsearch启动和部署的一系列问题
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
