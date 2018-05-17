package com.spring.demo;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SecureRestClient {

	public static void main(String[] args) {
		String userdetails = "bill:abc123";
		String encCred = new String(Base64.encodeBase64(userdetails.getBytes()));
		System.out.println(encCred);		
		
		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		headers.set("Authorization", "Basic " + encCred);

		HttpEntity he = new HttpEntity<Object>(headers);

		ResponseEntity<String> resp = rt.exchange("http://localhost:8181/app/find?empid=100", HttpMethod.GET, he,
				String.class);

		System.out.println("Request landed:" + resp.getBody());
	}
}
