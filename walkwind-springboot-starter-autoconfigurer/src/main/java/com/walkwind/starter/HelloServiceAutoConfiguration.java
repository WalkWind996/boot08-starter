package com.walkwind.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-20-23:04
 **/
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloServiceProperties.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloServiceProperties helloServiceProperties;

    @Bean
    public HelloService helloService(){
        HelloService service = new HelloService();
        service.setHelloServiceProperties(helloServiceProperties);
        return service;
    }

}
