package com.vladislavgarkun.awsdeployment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AwsDeploymentApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertThat(4).isEqualTo(3);
	}

}
