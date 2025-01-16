package com.datadriven;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJsonFile {

	@Test
	public void readJson() throws IOException, ParseException {

		JSONParser parser = new JSONParser();
		FileReader read = new FileReader("/Users/om.satapthy/eclipse-workspace/JavaSprint/resourse/sample4.json");

		Object obj = parser.parse(read); // convert json file --> java object

		JSONObject json = (JSONObject) obj;

		JSONArray jrr = (JSONArray) json.get("people");

		for (int i = 0; i < jrr.size(); i++) {
			JSONObject objs = (JSONObject) jrr.get(i);
			String fname = (String) objs.get("firstName");
			String last = (String) objs.get("lastName");
			String gender = (String) objs.get("gender");

			System.out.println(fname);
			System.out.println(last);
			System.out.println(gender);

		}

	}

}
