package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataToExcelFileInRowCell {

	public static void main(String[] args) throws IOException {
		/**
		 * Excel file - work book - sheet - row - cell
		 * Fileoutputstream to open the file in write mode
		 */
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\datadriventesting\\testdata\\data3.xlsx");
		//Create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//Create sheet
		XSSFSheet sheet = workbook.createSheet("MySheet1");		
		XSSFRow randomrow = sheet.createRow(1);
		XSSFCell randomcell = randomrow.createCell(3);
		randomcell.setCellValue("Welcome");
		
		//Now after updating the data to file attach the workbook to file
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
		
	}

}
