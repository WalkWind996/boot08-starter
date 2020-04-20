package com.walkwind.starter;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-20-22:40
 **/
public class HelloService {

    HelloServiceProperties helloServiceProperties;

    public HelloServiceProperties getHelloServiceProperties() {
        return helloServiceProperties;
    }

    public void setHelloServiceProperties(HelloServiceProperties helloServiceProperties) {
        this.helloServiceProperties = helloServiceProperties;
    }

    public String sayHello(String name){
        return helloServiceProperties.getPrefix()+"-"+name+"-"+helloServiceProperties.getSuffix();
    }
}
