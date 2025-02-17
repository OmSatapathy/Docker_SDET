package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DatadriverExcel {

	@Test
	public void readexcel() throws FileNotFoundException {

		FileInputStream fs = new FileInputStream(
				new File("/Users/om.satapthy/eclipse-workspace/JavaSprint/resourse/employee data.xlsx"));
		try (XSSFWorkbook wb = new XSSFWorkbook(fs)) {
			XSSFSheet sh = wb.getSheetAt(0);

			Iterator<Row> rowIterator = sh.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.iterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case STRING:
						System.out.println(cell.getStringCellValue());
						break;

					case NUMERIC:
						System.out.println(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.println(cell.getBooleanCellValue());
						break;
					case FORMULA:
						System.out.println(cell.getCellFormula());
						break;
					default:
						break;
					}
				}

			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void readExceldata() {
		try {
			FileInputStream fs = new FileInputStream(
					new File("/Users/om.satapthy/eclipse-workspace/JavaSprint/resourse/employee data.xlsx"));
			try (XSSFWorkbook wb = new XSSFWorkbook(fs)) {
				XSSFSheet sh = wb.getSheetAt(0);

				for (int i = 0; i < sh.getLastRowNum(); i++) {

					XSSFRow row = sh.getRow(i);
					row.getCell(i).getStringCellValue();
					
					System.out.println(row.getCell(i).getStringCellValue());

				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
