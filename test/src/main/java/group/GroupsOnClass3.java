package group;

import org.testng.annotations.Test;

@Test(groups = "teach")
public class GroupsOnClass3 {

	public void teach1() {
		System.out.println("GroupsOnClass1中teach111运行");
	}
	
	public void teach2() {
		System.out.println("GroupsOnClass1中teach222运行");
	}
}
