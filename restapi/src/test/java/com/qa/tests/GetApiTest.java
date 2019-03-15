package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Apiclient.Rest_Client;
import com.qa.base.TestBase;




public class GetApiTest extends TestBase{
	TestBase testBase;
	String serviceURL;
	String apiURL;
	String url;
	Rest_Client restclient;
	
	
	@BeforeMethod
	public void setUp() {
		
		testBase =  new TestBase();
		 serviceURL = prop.getProperty("URL");
		 apiURL = prop.getProperty(serviceURL);
		 url = serviceURL + apiURL;
		 System.out.println(url);
		
		
		
	}
	@Test
	public void getApiTest() throws ClientProtocolException, IOException {
		restclient =  new Rest_Client();
		restclient.get(url);	
		
		
		
	}
	
	

}
