package com.vladislavgarkun.awsdeployment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

@Slf4j
@RestController
public class HelloController {

    @Value("${operating.system}")
    private String os;

    @Value("${ec2}")
    private String ec2;

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHelloMessage(){
        log.info("Health request is processed");
        return "Hello from " + os + " " + ec2;
    }

}
