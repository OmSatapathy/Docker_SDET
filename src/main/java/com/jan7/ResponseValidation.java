package com.jan7;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseValidation {

	@Test
	public void getRequest() {

		Response res = RestAssured.given().accept(ContentType.JSON).contentType("appliaction/json").when()
				.get("https://api.restful-api.dev/objects").andReturn();

		
		 JsonPath jsonPath = res.jsonPath();
		List<Map<String, Object>> products = jsonPath.getList("$"); 
		
		for (Map<String, Object> product : products) {
            String id = (String) product.get("id");
            String name = (String) product.get("name");
            Map<String, Object> data = (Map<String, Object>) product.get("data");

            // Validate basic fields
            assert id != null && !id.isEmpty() : "ID is null or empty for product: " + name;
            assert name != null && !name.isEmpty() : "Name is null or empty for ID: " + id;

            // Validate `data` field if present
            if (data != null) {
                for (Map.Entry<String, Object> entry : data.entrySet()) {
                    assert entry.getValue() != null : "Data field '" + entry.getKey() + "' is null for product: " + name;
                }
            } else {
                System.out.println("Product " + name + " has no additional data.");
            }
        }

		
		
   
	}
	
	@Test
	public void verifyWithid() {
		
		Response res = RestAssured.given().accept(ContentType.JSON).contentType("appliaction/json").when()
				.get("https://api.restful-api.dev/objects?id=3&id=5&id=10").andReturn();
		
		
		String color = res.jsonPath().get("data[0].color");
		List<Object> name = res.jsonPath().getList("name");
		
		Assert.assertEquals(name.get(0), "Apple iPhone 12 Pro Max", "Name does not match!");
	}
}
