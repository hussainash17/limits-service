package com.dohatec.limitservice.controller;

import com.dohatec.limitservice.configuration.Configuration;
import com.dohatec.limitservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("limits")
    public Limits retriveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
