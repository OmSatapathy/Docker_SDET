package com.restapi;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseVerify {

	@Test
	public void verifyResponse() {
		Response res = RestAssured.given().accept(ContentType.JSON).contentType("application/json").when()
				.get("https://api.restful-api.dev/objects?id=3&id=5&id=10").andReturn();

		JsonPath value = res.body().jsonPath();
		List<String> list = value.getList("data");

		System.out.println(list);
	}
}
