package com.test;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class Ddepandtest {

	@Test
	public void test1() {
		System.out.println("test1 run");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"test1"})
	public void test2() {
		System.out.println("test2 run");
	}
	@Test
	public void test3() {
		System.out.println("test3 run");
	}
}
