package core.JavaSprint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVFile {

	public static void main(String[] args) throws CsvValidationException, IOException {
		
		BufferedReader read = new BufferedReader(new FileReader("/Users/om.satapthy/eclipse-workspace/JavaSprint/resourse/PCB defect-ok - Sheet1 (1).csv"));
		
		CSVReader csv = new CSVReader(read);
		String[] line;
		
		while((line= csv.readNext())!=null) {
			for (String string : line) {
				System.out.println(string);
			}
		}
	}

}
