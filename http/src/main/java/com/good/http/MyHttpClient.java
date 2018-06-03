package com.good.http;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.testng.annotations.Test;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

public class MyHttpClient {

	CookieStore  store;
	
	@Test
	public void test1() throws ClientProtocolException, IOException {
		//存放我们的结果
		String result;
		
		HttpGet get = new HttpGet("http://www.baidu.com");
		//这个是用例执行get方法的
		DefaultHttpClient client = new DefaultHttpClient();
		HttpResponse  response=client.execute(get);
		result=EntityUtils.toString(response.getEntity());
		
		//System.out.println(result);
		
		CookieStore store=client.getCookieStore();
		List<Cookie> cookielist = store.getCookies();
		for (Cookie cookie : cookielist) {
			String name = cookie.getName();
			String value = cookie.getValue();
			System.out.println("cooki name="+name+"value="+value);
		}
	}
	
	@Test(dependsOnMethods= {"test1"})
	public void takecookies() throws IOException {
		HttpGet get = new HttpGet("http://www.baidu.com");
		//这个是用例执行get方法的
		DefaultHttpClient client = new DefaultHttpClient();
		client.setCookieStore(this.store);
		HttpResponse response=client.execute(get);
		
		int statuscode = response.getStatusLine().getStatusCode();
		System.out.println(statuscode);
		if (statuscode == 200) {
			String result=EntityUtils.toString(response.getEntity());
			
			System.out.println(result);
		}
		
	}
}
