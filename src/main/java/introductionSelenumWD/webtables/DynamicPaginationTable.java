package introductionSelenumWD.webtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		Thread.sleep(3000);
		
		//close the window if displayed
		//if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
		//	driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		//}
		driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText(); //-- gets below text
		//Showing 1 to 10 of 8635 (864 Pages) -- From this fetch the data after ( and previous to pages
		System.out.println(text);
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println(total_pages);
		
		//repeting pages
		
		for(int p=1; p<=total_pages; p++) {
			
			if(p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				Thread.sleep(3000);
				active_page.click();
			}
			
			//Read the data from table
			
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			for(int r=1; r<=rows; r++) {
				String customerName =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[2]")).getText(); 
				String email =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				
				String group =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]/td[4]")).getText();
			System.out.println(customerName+ "\t" +email+" \t"+group);
			}
			
		}
		
	}

}
