package com.test;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut=3000) //单位为毫秒
	public static void test() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test(timeOut=2000) //单位为毫秒
	public static void test1() throws InterruptedException {
		Thread.sleep(3000);
	}
}
