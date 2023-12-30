package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public int doProduct(int a, int b) {
		return a*b;
	}
}
