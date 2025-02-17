package com.feb11;

import java.util.List;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	Laptop data = new Laptop(2022, 5900, "Intel 5i", "1 TB");
	PojoDetails pj = new PojoDetails("MAC ", data);

	@Test
	public void createObject() {
		Response res = RestAssured.given().contentType(ContentType.JSON).body(pj)
				.post("https://api.restful-api.dev/objects").andReturn();

		JSONObject json = new JSONObject(res.asString());

		JSONObject data = json.getJSONObject("data");

		Object val = data.get("year");
		System.out.println(val.toString());

	}

}
