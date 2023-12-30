package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCrudApplicationTests {	
	
	@Autowired
	private Calculator c;
	
	@Test
	void testSum() {
		
		// Expected Result
		int expectedResult = 14;
		
		// Actual Result
		int actualResult = c.sum(2, 5, 7);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
	
	@Test
	@Disabled
	void testProduct() {
		
		// Expected Result
		int expectedResult = 10;
		
		// Actual Result
		int actualResult = c.doProduct(2, 5);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}

}
