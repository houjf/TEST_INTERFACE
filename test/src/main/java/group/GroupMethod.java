package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
/**
 * 
 * @author houzf
 *
 */
public class GroupMethod {

	@Test(groups = "server")
	public void group1() {
		System.out.print("1");
	}
	
	@Test(groups = "server")
	public void group2() {
		System.out.print("2");
	}
	
	@Test(groups = "client")
	public void group3() {
		System.out.print("3");
	}
	
	@Test(groups = "client")
	public void group4() {
		System.out.print("4");
	}
	
	@BeforeGroups("server")
	public void beforegroupsrun() {
		System.out.print("这是在服务端运行之前运行");
	}
	
	@AfterGroups("server")
	public void aftergroupsrun() {
		System.out.print("这是在客户端运行之前运行");
	}
	
}
