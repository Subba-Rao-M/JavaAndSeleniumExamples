package testngintegration.parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelDemo_3 {
	DataFormatter formatter = new DataFormatter();
	
	@Test(dataProvider="testData")
	public void testDataProvider(String msg1, String msg2, int id) {
		System.out.println(msg1+ " "+msg2+"            "+id);
		
	}
	
	@DataProvider(name="testData")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\datadriventesting\\testdata\\TestCases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("TestCase2");
		int rowsCount = sheet.getPhysicalNumberOfRows();
		XSSFRow  row = sheet.getRow(0);
		int colsCount = row.getPhysicalNumberOfCells();
		Object[][]	data = new Object[rowsCount-1][colsCount];
		for(int i=0; i< rowsCount-1; i++) {
			sheet.getRow(i+1); // To exlude header and data value row
			for (int j=0; j<colsCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
			}
			
		}
	//Object[][]	data = {{"hello", "msg", 1}, {"greetings", "comm", 111}, {"solo", "call", 101}};
	return data;
		
	}

}
