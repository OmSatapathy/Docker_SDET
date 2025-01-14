package com.apitest;

import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCreateuser {

	Response res;

 @Test
	public void createuser() throws JsonMappingException, JsonProcessingException {
		User user = new User("Manish", "lead");

		ObjectMapper mp = new ObjectMapper();
		try {
			mp.writerWithDefaultPrettyPrinter().writeValueAsString(user);

			res = RestAssured.given().accept(ContentType.JSON).contentType("application/json").body(user).when()
					.post("https://reqres.in/api/users").andReturn();

			System.out.println(res.asPrettyString());
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		String name = res.jsonPath().getString("name");
		String id = res.jsonPath().getString("id");

		System.out.println(name);
		System.out.println(id);

	}

	@Test
	public void createLaptop() throws JsonProcessingException {

		Laptop lap = new Laptop();
		lap.setYear(2009);
		lap.setModel("core i7");
		lap.setHarddisk("2 Tb");
		lap.setPrice(2000.77);

		Assert obj = new Assert();
		obj.setName("Apple mac");
		obj.setData(lap);

		ObjectMapper mp = new ObjectMapper();
		mp.writerWithDefaultPrettyPrinter().writeValueAsString(obj);

		Response res = RestAssured.given()
				.contentType("application/json")
				.accept(ContentType.JSON).when()
				.body(mp)
				.post("https://api.restful-api.dev/objects").andReturn();
		
		System.out.println(res.prettyPrint());
		
		String id = res.jsonPath().get("id");
		System.out.println(id);

	}

}
