package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcelFile {

	public static void main(String[] args) throws IOException {
		/**
		 * Excel file - work book - sheet - row - cell
		 * Fileoutputstream to open the file in write mode
		 */
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\datadriventesting\\testdata\\data1.xlsx");
		//Create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//Create sheet
		XSSFSheet sheet = workbook.createSheet("MySheet1");
		//Capture the first row
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Header1");
		row1.createCell(1).setCellValue("Header2");
		row1.createCell(2).setCellValue("Header3");
		row1.createCell(3).setCellValue("Header4");
		row1.createCell(4).setCellValue("Header5");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Data1");
		row2.createCell(1).setCellValue("Data2");
		row2.createCell(2).setCellValue("Data3");
		row2.createCell(3).setCellValue(1234);
		row2.createCell(4).setCellValue(true);
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Data11");
		row3.createCell(1).setCellValue("Data21");
		row3.createCell(2).setCellValue("Data31");
		row3.createCell(3).setCellValue(3451);
		row3.createCell(4).setCellValue(false);
		
		//Now after updating the data to file attach the workbook to file
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
		
	}

}
