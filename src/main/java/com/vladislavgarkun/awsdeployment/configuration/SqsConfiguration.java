package com.vladislavgarkun.awsdeployment.configuration;

import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SqsConfiguration {

    @Value("${cloud.aws.region.static}")
    private String region;

    @Bean
    public AmazonSQSAsync amazonSQSAsync() {
        return AmazonSQSAsyncClientBuilder
                .standard()
                .withRegion(region)
                .withCredentials(new InstanceProfileCredentialsProvider(true))
                .build();
//        return AmazonS3Client.builder()
//                .withRegion("us-east-1")
//                .withCredentials(new AWSStaticCredentialsProvider(creds))
//                .build();
    }

}
