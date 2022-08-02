package org.restassuredss;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/";
		
		Response res = RestAssured.given()
.header("content-Type","application/json").body("{\r\n" +
		"    \"name\": \"morpheus\",\r\n" +
		"    \"job\": \"leader\"\r\n" +
"}").
		
	}

}
