package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataToExcelFile {

	public static void main(String[] args) throws IOException {
		/**
		 * Excel file - work book - sheet - row - cell
		 * Fileoutputstream to open the file in write mode
		 */
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\datadriventesting\\testdata\\data2.xlsx");
		//Create workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		//Create sheet
		XSSFSheet sheet = workbook.createSheet("MySheet1");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of rows : ");
		int noofrows = sc.nextInt();
		System.out.println(" Enter the number of cells : ");
		int noofcells = sc.nextInt();
		System.out.println(noofrows);
		System.out.println(noofcells);
		
		for (int r=0; r<=noofrows; r++) {
			
			XSSFRow currentrow = sheet.createRow(r);
			System.out.println(currentrow);
			for (int c=0; c<noofcells; c++ ) {
				XSSFCell cell = currentrow.createCell(c);
				System.out.println("Enter the cell value : ");
				cell.setCellValue(sc.next()); //User entered value accepted using sc.next
			}
			System.out.println("Current row"+currentrow);
		}
		
		//Now after updating the data to file attach the workbook to file
		workbook.write(file);
		workbook.close();
		file.close();
		sc.close();
		
		System.out.println("File is created");
		
		
	}

}
