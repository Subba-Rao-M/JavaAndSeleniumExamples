package introductionSelenumWD.framesAndIframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		//Pass frame as webelement
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Welcome");
		
		//Come out of frame 1
		driver.switchTo().defaultContent(); // To move the driver control out of frame 1
		
		//Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		
		//Frame 3 and interacting with inner frame
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Welcome to Python");
		
		
		//Switch to frame inside frame 3 since single frame inside frame 3 use index
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//div[@class = 'rseUEf nQOrEb']")).click(); -- Direct xpath not working
		
		/**
		 * Open the inner iframe url in separate browser and check for xpath
		 * https://docs.google.com/forms/u/0/d/e/1FAIpQLScP-K8zi-9ar0MCq93D3VIFhegSNPveBfdLqiMfTYR9Q1iSKQ/formResponse?embedded=true
		 */
		
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		//Clicking element using java script executor
		
		WebElement checkboxitem = driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkboxitem);
				
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.close();
	}

}
