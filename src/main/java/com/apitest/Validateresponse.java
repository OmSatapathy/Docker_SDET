package com.apitest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Validateresponse {

	@Test
	public void getEmployee() {
		Response res = RestAssured.given().contentType("application/json").when()
				.get("http://dummy.restapiexample.com/api/v1/employees").andReturn();

		System.out.println(res.prettyPrint());

		System.out.println(res.getStatusCode());

		String name = res.jsonPath().get("data[3].employee_name").toString();
		System.out.println(name);

		JSONObject jo = new JSONObject(res.asString());
		String name5 = jo.getJSONArray("data").getJSONObject(4).get("employee_name").toString();

		JSONObject jos = new JSONObject(res.toString());
		for (int i = 0; i < jos.getJSONArray("data").length(); i++) {

			String names = jos.getJSONArray("data").getJSONObject(i).get("employee_name").toString();
			System.out.println(names);
		}

	}
	
	
	
	@Test
	public void getEmployee1() {
		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://reqres.in/api/unknown").andReturn();

		System.out.println(res.getStatusCode());

		String name = res.jsonPath().get("data[3].name").toString();
		System.out.println(name);

		JSONObject jo = new JSONObject(res.asString());
		String name5 = jo.getJSONArray("data").getJSONObject(4).get("name").toString();

		JSONObject jos = new JSONObject(res.asString());
		for (int i = 0; i < jos.getJSONArray("data").length(); i++) {
			String names = jos.getJSONArray("data").getJSONObject(i).get("name").toString();
			System.out.println(names);
		}

	}
	
	
	
	@Test
	public void getAlldetails() {
		Response res = RestAssured.given().contentType("application/json").when()
				.get("https://api.restful-api.dev/objects").andReturn();

		System.out.println(res.getStatusCode());
		
		JSONArray json = new JSONArray(res.asString());
		
		JSONObject obj1 = json.getJSONObject(0);
		System.out.println(obj1);
		
		
		for (int i = 0; i < json.length(); i++) {
		    JSONObject obj = json.getJSONObject(i);
		    System.out.println("color: " + obj.getString("color"));
		    System.out.println("capacity: " + obj.getString("capacity"));
		}
	}

}
