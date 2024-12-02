package introductionSelenumWD.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDropDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement sourceRome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement destItaly = driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(sourceRome, destItaly).build().perform();
		

	}

}
