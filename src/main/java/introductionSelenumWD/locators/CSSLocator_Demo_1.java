package introductionSelenumWD.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class CSSLocator_Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver(); //WebDriver is interface and EdgeDriver class
		driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//Using tag name and id format tagname#id
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Subba");
		//Using only id and no tag name
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Rao");
		
		//tag.classname or .classname
		//If multiple element use findelements()
		//If space in class name enter unique value without space
		
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		//driver.findElement(By.cssSelector(".btn-primary")).sendKeys("Shirts");
		System.out.println(driver.findElements(By.cssSelector("a.list-group-item")).size());
		
		// tag and attributes tag[attribute = 'value']
		
		driver.findElement(By.cssSelector("input[type = 'submit']"));
		System.out.println(driver.findElements(By.cssSelector("input[type = 'radio']")).size());
		
		//tag, class name and attribute tag.className[attribute = 'value'] 
		//Useful if there is any attribute value which is commoun under input type and class name
		//Tagname is optional here also
		
		driver.findElement(By.cssSelector("input.btn-primary[type = 'submit']"));
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
