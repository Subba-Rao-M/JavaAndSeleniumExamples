package rsUdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_20_FramesHandling_Demo_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame); //using frame as web element if frame dont have name
		//driver.switchTo().frame(1); // using index
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		draggable.click();
		Actions a = new Actions(driver);
		a.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent();
		System.out.println("Drag and drop completed");
		driver.close();

	}

}
