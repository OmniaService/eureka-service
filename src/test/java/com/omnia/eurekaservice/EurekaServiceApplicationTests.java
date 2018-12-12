package com.omnia.eurekaservice;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.cloud.config.enabled:false"})
public class EurekaServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
