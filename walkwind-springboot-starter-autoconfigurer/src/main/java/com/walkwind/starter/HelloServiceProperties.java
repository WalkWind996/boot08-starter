package com.walkwind.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-20-22:41
 **/
@ConfigurationProperties("walkwind.hello")
public class HelloServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
