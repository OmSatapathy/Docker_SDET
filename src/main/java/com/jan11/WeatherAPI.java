package com.jan11;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class WeatherAPI {

	@Test
	public void weatherTest() {

		Response res = RestAssured.given().accept(ContentType.JSON).
				when().get("https://api.weather.gov/openapi.json")
				.andReturn();

//	System.out.println(res.prettyPrint());
		
	int code= 	res.getStatusCode();
	System.out.println(code);
	
     	res.jsonPath().get("paths").toString();
     	
     	System.out.println(res.jsonPath().get("paths").toString());
	}

}
