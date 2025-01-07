package databaseConnect;

import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbConnect {
	 static WebDriver driver;

	public static void main(String[] args) {
		 MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017"); // Replace with your MongoDB URI
	        MongoDatabase database = mongoClient.getDatabase("testDB"); // Replace with your DB name
	        MongoCollection<Document> collection = database.getCollection("users"); // Replace with your collection name

	         driver = new ChromeDriver();
	        
	        try {
	            // Fetch data from MongoDB and use it in Selenium
	            for (Document doc : collection.find()) {
	                String username = doc.getString("username");
	                String password = doc.getString("password");

	                // Navigate to login page
	                driver.get("https://example.com/login"); // Replace with your URL

	                // Interact with the web page
	                driver.findElement(By.id("username")).sendKeys(username); // Replace with your locator
	                driver.findElement(By.id("password")).sendKeys(password); // Replace with your locator
	                driver.findElement(By.id("login")).click(); // Replace with your locator

	                System.out.println("Test executed for user: " + username);
	            }
	        } finally {
	            // Cleanup
	            driver.quit();
	            mongoClient.close();
	        }
	}

}
