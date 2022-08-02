package org.restassuredss;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		io.restassured.RestAssured.baseURI = "https://reqres.in/";
		
		Response res = io.restassured.RestAssured.given().header("content-type","application/json")
				.when().get("api/users/2");
		
		int statusCode = res.getStatusCode();
		
		System.out.println(statusCode);
		System.out.println(res.getBody().asString());
		String contentType = res.getContentType();
		System.out.println(contentType);
		
	}

}
