package introductionSelenumWD.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement minSlider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]")); // start point of slider
		
		System.out.println(" Default Location of min slider : " +minSlider.getLocation()); //(59, 289)
		System.out.println("Location of min slider for X axis : " +minSlider.getLocation().getX());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlider, 100, 251).build().perform(); // 59+100
		System.out.println("Location of min slider after moving : " +minSlider.getLocation()); 
		
		//Max slider to reduce value
		
		WebElement maxSlider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]")); // End point of slider
		
		System.out.println(" Default Location of max slider : " +maxSlider.getLocation()); //(59, 289)
		System.out.println("Location of min slider for X axis : " +maxSlider.getLocation().getX());
		
		act.dragAndDropBy(maxSlider, -100, 399).build().perform(); // 59+100
		System.out.println("Location of min slider after moving : " +maxSlider.getLocation()); 

	}

}
