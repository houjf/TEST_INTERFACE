package com.houzf.city;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testreport {

	@Test
	public void test1() {
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void logdemo() {
		Reporter.log("这是自己运行的实例日志");
		throw new RuntimeException("这是我自己抛出的一个异常");
	}
}
