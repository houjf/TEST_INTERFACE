package suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Config {

	@BeforeSuite
	public void beforsuit() {
		System.out.println("beforesuit运行了");
		
	}
	@AfterSuite
	public void beforsuit1() {
		System.out.println("AfterSuite运行了");
		
	}
}
