package com.dohatec.limitservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limits-service")
@Data
public class Configurations {
    private int minimum;
    private int maximum;
    private String username;
}
