package Paramiter;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateObject {

	@Test(dataProvider = "houzf")
	public void testDate(String name, int age) {

		System.out.println("name:" + name + "age:" + age);

	}

	@DataProvider(name = "houzf")
	public Object[][] providerDate() {
		Object[][] o = new Object[][] { { "张三", 20 }, { "李四", 30 }, { "王五", 48 }, };
		return o;
	}

	@Test(dataProvider = "math")
	public void test1(String name, int age) {
		System.out.println(name + ":" + age);
	}

	@Test(dataProvider = "math")
	public void test2(String name, int age) {
		System.out.println(name + ":" + age);
	}

	@DataProvider(name="math")
	public Object[][] date(Method method){
		Object[][] result=null;
		if(method.getName().equals("test1")) {
			result=new Object[][] {
				{"张三",15}
			};
		}else if (method.getName().equals("test2")) {
			result=new Object[][] {
				{"lisi",37}
		};
		}
		return result;
		}
}
