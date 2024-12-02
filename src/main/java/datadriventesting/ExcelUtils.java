package datadriventesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;   
	String path;
	
	public ExcelUtils(String path)
	{
		this.path=path;
	}
		
	public int getRowCount(String sheetName) throws IOException 
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;		
	}
	
	public int getCellCount(String sheetName,int rownum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellcount;
	}
	
	
	public String getCellData(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try{
		//data = cell.toString();
		data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e) //If data is empty in cell then it will throw exception, capture it and make data empty
		{
			data="";
		}
		finally {
			workbook.close();
			fi.close();
		}
		
		return data;
	}
	
	public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
	{
		File xlfile=new File(path);
		if(!xlfile.exists())    // If file not exists then create new file
		{
		workbook=new XSSFWorkbook();
		fo=new FileOutputStream(path);
		workbook.write(fo);
		}
				
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
			
		if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
			workbook.createSheet(sheetName);
		sheet=workbook.getSheet(sheetName);
					
		if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
				sheet.createRow(rownum);
		row=sheet.getRow(rownum);
		
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		workbook.write(fo);		
		workbook.close();
		fi.close();
		fo.close();
	}
	
	
	/*public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}*/
	
	public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {
	    FileInputStream fi = null;
	    FileOutputStream fo = null;
	    XSSFWorkbook workbook = null;

	    try {
	        // Input stream for the Excel file
	        fi = new FileInputStream(path);
	        workbook = new XSSFWorkbook(fi);
	        XSSFSheet sheet = workbook.getSheet(sheetName);

	        // Retrieve the row and cell
	        XSSFRow row = sheet.getRow(rownum);
	        XSSFCell cell = row.getCell(colnum);

	        // Apply the cell style
	        XSSFCellStyle style = workbook.createCellStyle();
	        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	        cell.setCellStyle(style);

	        // Output stream for saving changes
	        fo = new FileOutputStream(path);
	        workbook.write(fo);
	    } finally {
	        // Close resources
	        if (workbook != null) workbook.close();
	        if (fi != null) fi.close();
	        if (fo != null) fo.close();
	    }
	}
	
	
	public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}
	


	public void fillColor(String sheetName, int rownum, int colnum, IndexedColors color) throws IOException {
	    FileInputStream fi = null;
	    FileOutputStream fo = null;
	    XSSFWorkbook workbook = null;

	    try {
	        // Input stream for the Excel file
	        fi = new FileInputStream(path);
	        workbook = new XSSFWorkbook(fi);
	        XSSFSheet sheet = workbook.getSheet(sheetName);

	        // Retrieve the row and cell
	        XSSFRow row = sheet.getRow(rownum);
	        XSSFCell cell = row.getCell(colnum);

	        // Apply the cell style
	        XSSFCellStyle style = workbook.createCellStyle();
	        style.setFillForegroundColor(color.getIndex());
	        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	        cell.setCellStyle(style);

	        // Output stream for saving changes
	        fo = new FileOutputStream(path);
	        workbook.write(fo);
	    } finally {
	        // Close resources
	        if (workbook != null) workbook.close();
	        if (fi != null) fi.close();
	        if (fo != null) fo.close();
	    }
	}

	
	

}
