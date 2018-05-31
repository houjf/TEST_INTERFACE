package MulitThread;

import org.testng.annotations.Test;

public class Mio {

	@Test
	public void test33() {
		System.out.println("4");
		System.out.printf("thread id:%s%n",Thread.currentThread().getId());
	}
	@Test
	public void test233() {
		System.out.println("5");
		System.out.printf("thread id:%s%n",Thread.currentThread().getId());
	}
	@Test
	public void test355() {
		System.out.println("6");
		System.out.printf("thread id:%s%n",Thread.currentThread().getId());
	}
}
