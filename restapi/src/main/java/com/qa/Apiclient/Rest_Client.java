package com.qa.Apiclient;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Rest_Client {
	
	//GET Method
	
	public void get(String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		System.out.println(httpclient);
		HttpGet httpget = new  HttpGet(url); //httpget request//
		CloseableHttpResponse Closablehttppresponse = httpclient.execute(httpget); //hit the get URL
		///First status code we r getting
		int statuscode = Closablehttppresponse.getStatusLine().getStatusCode();
		System.out.println(statuscode);
		
		//2 json string
		
		String responseString = EntityUtils.toString(Closablehttppresponse.getEntity(),"UTF-8");
		
		JSONObject response_in_jsonobject = new JSONObject(responseString);
		
		System.out.println("Response json is = " + response_in_jsonobject + " ");
		
		//3.All  headers willl  get
		
		Header[] headerarray =Closablehttppresponse.getAllHeaders();
		HashMap allheaders  = new HashMap<String,String>();
		
		for(Header header : headerarray) {
			
			allheaders.put(header.getName(), header.getValue());
		}
		
		
		
	}
}
