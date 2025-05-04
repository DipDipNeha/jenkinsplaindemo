package com.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJenkinsPlainApplicationTests {

	@Test
	 contextLoads() {
		System.err.println("Hello Tested");
		
		System.err.println("Hello Tested new Build Generated");
		assertEquals(true, true);
		
	}

}
