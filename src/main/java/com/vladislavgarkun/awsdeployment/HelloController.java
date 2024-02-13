package com.vladislavgarkun.awsdeployment;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHelloMessage(){
        return "Hello from EC2";
    }

}
