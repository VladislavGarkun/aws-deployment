package com.vladislavgarkun.awsdeployment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${logging.file.path}")
    private String os;

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHelloMessage(){
        return "Hello from " + os + " EC2";
    }

}
