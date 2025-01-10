package com.easyapply;
import org.testng.annotations.Test;
import org.testng.Assert;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;



public class XMLParameterVerificationTest1 {

	@Test
    public void verifyParametersPresence() {
        try {
            File xmlFile = new File("/Users/om.satapthy/eclipse-workspace/docker_sdet/files/rapido.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList jobNodeList = doc.getElementsByTagName("job");
        //    Assert.assertEquals(jobNodeList.getLength(), 100, "Number of job elements is not as expected.");

            for (int i = 0; i < jobNodeList.getLength(); i++) {
                Element jobElement = (Element) jobNodeList.item(i);

                // Verify presence of parameters within each job element
//                Assert.assertNotNull(jobElement.getElementsByTagName("title").item(i), "Title is not present in job element " + i);
//                Assert.assertNotNull(jobElement.getElementsByTagName("company").item(i), "Company is not present in job element " + i);
//                Assert.assertNotNull(jobElement.getElementsByTagName("city").item(i), "City is not present in job element " + i);
//                Assert.assertNotNull(jobElement.getElementsByTagName("state").item(i), "State is not present in job element " + i);
//                Assert.assertNotNull(jobElement.getElementsByTagName("country").item(i), "Country is not present in job element " + i);
//                Assert.assertNotNull(jobElement.getElementsByTagName("url").item(i), "URL is not present in job element " + i);
//                
                
                System.out.println(jobElement.getElementsByTagName("title").item(i).getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception occurred: " + e.getMessage());
        }
   }
}