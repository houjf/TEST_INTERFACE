package com.test;

import org.testng.annotations.Test;

public class Exception {

	@Test(expectedExceptions = RuntimeException.class)
	public void ty(){
		System.out.println("runerro");
		throw new RuntimeException();
		
		}
}
