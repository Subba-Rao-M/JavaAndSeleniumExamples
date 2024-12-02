package datadriventesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculatorDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		String filepath =System.getProperty("user.dir")+"/src/main/java/datadriventesting/testdata/Interest.xlsx";
		
		ExcelUtils xlutil = new ExcelUtils(filepath);
		int rows = xlutil.getRowCount("Sheet1");
		System.out.println(rows);
		
		for (int r=1; r<=rows; r++) {
			String prin = xlutil.getCellData("Sheet1", r, 0);
			String roi = xlutil.getCellData("Sheet1", r, 1);
			String per1 = xlutil.getCellData("Sheet1", r, 2);
			String per2 = xlutil.getCellData("Sheet1", r, 3);
			String freq = xlutil.getCellData("Sheet1", r, 4);
			String expmval = xlutil.getCellData("Sheet1", r, 5);
		//	String expres = xlutil.getCellData("Sheet1", r, 6);
			
			driver.findElement(By.xpath("//input[@id=\"principal\"]")).sendKeys(prin);
			driver.findElement(By.xpath("//input[@id=\"interest\"]")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id=\"tenure\"]")).sendKeys(per1);
			
			Select predrp = new Select(driver.findElement(By.xpath("//select[@id=\"tenurePeriod\"]")));
			predrp.selectByVisibleText(per2);
			
			Select freqdrp = new Select(driver.findElement(By.xpath("//select[@id=\"frequency\"]")));
			freqdrp.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
			
			String actmval = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(expmval)==Double.parseDouble(actmval)) {
				System.out.println("Test Passed");
				xlutil.setCellData("Sheet1", r, 7, "Passed");
				xlutil.fillGreenColor("Sheet1", r, 7);
				xlutil.fillColor("Sheet1", r, 7, IndexedColors.GREEN);
			}
			else {
				System.out.println("Test Failed");
				xlutil.setCellData("Sheet1", r, 7, "Failed");
				xlutil.fillColor("Sheet1", r, 7, IndexedColors.RED);
			}
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		driver.quit();

	}

}
