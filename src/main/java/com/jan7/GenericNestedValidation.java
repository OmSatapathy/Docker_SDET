package com.jan7;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GenericNestedValidation {
	@Test
    public void validateNestedJson() {
    
        RestAssured.baseURI = "https://api.example.com";
        Response response = given()
                .when()
                .get("/employees")
                .then()
                .statusCode(200) // Validate HTTP Status
                .extract()
                .response();


        JsonPath jsonPath = response.jsonPath();

     
        Map<String, Object> rootMap = jsonPath.getMap("$");


        for (String key : rootMap.keySet()) {
            Object value = rootMap.get(key);

         
            if (value instanceof List) {
                List<Map<String, Object>> items = (List<Map<String, Object>>) value;

   
                for (Map<String, Object> item : items) {
                    Assert.assertTrue(item.containsKey("firstName"), "Missing 'firstName' in " + key);
                    Assert.assertTrue(item.containsKey("lastName"), "Missing 'lastName' in " + key);
                    Assert.assertTrue(item.containsKey("age"), "Missing 'age' in " + key);
                    Assert.assertTrue((Integer) item.get("age") > 0, "Age should be greater than 0 in " + key);
                }
            } else {

                Assert.assertNotNull(value, "Value for key '" + key + "' should not be null.");
            }
        }

        System.out.println("Response:");
        response.prettyPrint();

}
