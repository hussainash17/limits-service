package com.dohatec.limitservice.controller;

import com.dohatec.limitservice.configuration.Configurations;
import com.dohatec.limitservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LimitsController {

    @Value("${usersName}")
    String username;

    @GetMapping("username")
    public String userName() {
        return this.username + " Hi there";
    }

    @Autowired
    private Configurations configurations;

    @GetMapping("limits")
    public Limits retriveLimits() {
        System.out.println(configurations.getUsername());
        return new Limits(configurations.getMinimum(), configurations.getMaximum(), configurations.getUsername());
    }
}
