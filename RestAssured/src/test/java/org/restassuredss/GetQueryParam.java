package org.restassuredss;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetQueryParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/";
		
		Response res = RestAssured.given().queryParam("page", "2").header("content-Type","application/json").when().get("api/users");
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.contentType());
		
		
	}

}
