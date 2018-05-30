package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public static void test1()
    {
        System.out.println( "Hello World!" );
    }
	@Test
    public static void test2()
    {
        System.out.println( "这是第二个用例" );
    }
	@BeforeMethod
	public void befor() {
		System.out.print("这是在方法之前运行");
	}
	@AfterMethod
	public void afet() {
		System.out.print("这是在方法之后运行");
	}
	@BeforeClass
	public void lei() {
		System.out.print("BeforeClass这是在类之前运行的");
	}
	@AfterClass
	public void lei3() {
		System.out.print("AfterClas这是在类运行之后的");
	}
	
	@BeforeSuite
	public void suit() {
		System.out.print("BeforeSuite这是在测试套件");
	}
	
	@AfterSuite
	public void suit2() {
		System.out.print("AfterSuite这是测试套件");
	}
}
