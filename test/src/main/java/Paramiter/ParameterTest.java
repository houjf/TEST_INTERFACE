package Paramiter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
 
	@Test
	@Parameters({"name","age"})
	public void para(String name ,int age) {
		System.out.println("name:"+name+"age:"+age);
	}
}
