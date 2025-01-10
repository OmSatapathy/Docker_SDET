package docker_sdet;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class FileCreation {

	public static void main(String[] args) {
		 String filename = "/Users/om.satapthy/eclipse-workspace/docker_sdet/src/main/java/output.csv"; // Name of the output CSV file
	        
	        // Generate CSV data
	        StringBuilder csvData = new StringBuilder();
	        csvData.append("date,total_number,partner_name\n"); // Header
	        
	        // Generate sample data for 10 rows
	        Random random = new Random();
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        for (int i = 0; i < 10; i++) {
	            String date = LocalDate.now().minusDays(i).format(dateFormatter); // Random date from the last 10 days
	            int totalNumber = random.nextInt(1000); // Random total number
	            String partnerName = "Partner " + (i + 1); // Partner name
	            
	            // Append data to CSV string
	            csvData.append(date).append(",").append(totalNumber).append(",").append(partnerName).append("\n");
	        }
	        
	        // Write CSV data to file
	        try (FileWriter writer = new FileWriter(filename)) {
	            writer.write(csvData.toString());
	            System.out.println("CSV file generated: " + filename);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
