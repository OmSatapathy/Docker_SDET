package com.easyapply;

import org.testng.annotations.Test;
import org.testng.Assert;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class XMLParameterVerificationTest {

//    @Test
	public void verifyTitlePresence() {
		try {
			File xmlFile = new File("/Users/om.satapthy/eclipse-workspace/docker_sdet/files/rapido.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			NodeList jobNodeList = doc.getElementsByTagName("job");
			Element jobElement = (Element) jobNodeList.item(0); // Assuming there is only one job element

			// Verify title presence
			String title = jobElement.getElementsByTagName("title").item(0).getTextContent();

			System.out.println(title);
			Assert.assertNotNull(title);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception occurred: " + e.getMessage());
		}
	}

	// @Test
	public void verifyCompanyPresence() {
		try {
			File xmlFile = new File("/Users/om.satapthy/eclipse-workspace/docker_sdet/files/rapido.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			NodeList jobNodeList = doc.getElementsByTagName("job");
			Element jobElement = (Element) jobNodeList.item(0); // Assuming there is only one job element

			// Verify company presence
			String company = jobElement.getElementsByTagName("company").item(0).getTextContent();
			System.out.println(company);
			Assert.assertNotNull(company);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void verifyCityPresence() {

		List<String> parameterNames = Arrays.asList("title", "company", "city", "state", "country", "url",
				"postal-code", "jobtype", "interview_json", "dateposted", "streetaddress");

		try {
			File xmlFile = new File("/Users/om.satapthy/eclipse-workspace/docker_sdet/files/rapido.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			NodeList jobNodeList = doc.getElementsByTagName("job");

			for (int i = 0; i < jobNodeList.getLength(); i++) {

				Element jobElement = (Element) jobNodeList.item(i);

				for (String paramName : parameterNames) {
					String paramValue = jobElement.getElementsByTagName(paramName).item(0).getTextContent();

					// System.out.println(jobElement.getElementsByTagName("streetaddress").item(0).getTextContent());
					Assert.assertNotNull(paramValue, "Parameter '" + paramName + "' is not present in the XML file.");

					Assert.assertNotNull(jobElement.getElementsByTagName("title").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("company").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("city").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("state").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("country").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("url").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("postal-code").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("jobtype").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("interview_json").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("jobtype").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("dateposted").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("streetaddress").item(0).getTextContent());

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void Monster() {

		List<String> parameterNames = Arrays.asList("title", "company", "city", "state", "country", "url", "postalcode",
				"posturl", "refcode", "posteddate", "city", "questionnaireurl");

		try {
			File xmlFile = new File("/Users/om.satapthy/eclipse-workspace/docker_sdet/files/Monster.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			NodeList jobNodeList = doc.getElementsByTagName("job");

			for (int i = 0; i < jobNodeList.getLength(); i++) {

				Element jobElement = (Element) jobNodeList.item(i);

				for (String paramName : parameterNames) {
					String paramValue = jobElement.getElementsByTagName(paramName).item(0).getTextContent();

					System.out.println(jobElement.getElementsByTagName("questionnaireurl").item(0).getTextContent());
					Assert.assertNotNull(paramValue, "Parameter '" + paramName + "' is not present in the XML file.");

					Assert.assertNotNull(jobElement.getElementsByTagName("title").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("company").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("city").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("state").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("country").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("url").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("postalcode").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("posturl").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("city").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("questionnaireurl").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("posteddate").item(0).getTextContent());
					Assert.assertNotNull(jobElement.getElementsByTagName("refcode").item(0).getTextContent());

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Exception occurred: " + e.getMessage());
		}
	}

	@Test
	public void verifyCountryPresence() {
		// Similar logic as verifyTitlePresence() for verifying country presence
	}

	@Test
	public void verifyURLPresence() {
		// Similar logic as verifyTitlePresence() for verifying URL presence
	}
}
