package com.good.http;


import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetCookies {

	private String url;
	private ResourceBundle bundle;
	
	@BeforeTest
	public void beforetest() {
		bundle = ResourceBundle.getBundle("application",Locale.CHINA);
		url = bundle.getString("test.url");
	}
	
	@Test
	public void testgetcookies() throws IOException {
		String result;
		
		HttpGet get = new HttpGet(this.url+bundle.getString("getcookies"));
		
		HttpClient client = new DefaultHttpClient();
		
		HttpResponse response = client.execute(get);
		result=EntityUtils.toString(response.getEntity());
		System.out.println(result);
	}
}
