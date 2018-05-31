package suit;

import org.testng.annotations.Test;

public class Igno {

	@Test
	public void ignore1() {
		System.out.print("this is the test one");
	}
	
	@Test(enabled = false)
	public void ignore2() {
		System.out.print("this is the test two");
	}
	
	@Test(enabled = true)
	public void ignore3() {
		System.out.print("this is the test three");
	}
}
