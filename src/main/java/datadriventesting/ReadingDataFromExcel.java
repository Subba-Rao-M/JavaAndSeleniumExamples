package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		/**
		 * Excel file - work book - sheet - row - cell
		 */
		
		//Open the excel file in read mode using fileinputstream
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\datadriventesting\\testdata\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//XSSFSheet sheet1 = workbook.getSheetAt(0); // TO get sheet based on the index in order
		//workbook.getNumberOfSheets() - if more than one sheet to retrieve sheet based on index or using sheet name using for loop and for received sheet name perform action
		//Now count the number of rows and cell in a sheet like 2 dimentional array
		
		int totalrows = sheet.getLastRowNum(); // To get the last row in a sheet i.e no of rows in sheet
		int totalcells = sheet.getRow(0).getLastCellNum(); // to get the number of cells
		
		System.out.println("Number of rows : "+totalrows);
		System.out.println("Number of Cells : "+totalcells);
		
		for(int r=0; r<=totalrows; r++) { // row index always starts from 0
			XSSFRow currentrow = sheet.getRow(r); //Get the current row
			for (int c=0; c<totalcells; c++) { // For column since it starts from 0 as per java so use < here as ideally it is 1st column
				XSSFCell currentcell = currentrow.getCell(c);
				String valueincell = currentcell.toString(); // TO string converts all data to string format
				//String valueincell = currentrow.getCell(c).toString(); // Combined statement for above
				System.out.println(" Data in Cell value : "+valueincell+"\t");
				//Enhanced loop is only for collection type
			}
			System.out.println();
		}
		
		//close the workbook and file after operation as it consumes memory
		workbook.close();
		file.close();
		
	}

}
