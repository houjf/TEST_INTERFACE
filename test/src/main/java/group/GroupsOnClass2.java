package group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

	public void stu1() {
		System.out.println("GroupsOnClass1中stu1111运行");
	}
	
	public void stu2() {
		System.out.println("GroupsOnClass1中stu222运行");
	}
}
