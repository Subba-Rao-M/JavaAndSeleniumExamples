package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthenticationDemo {

	public static void main(String[] args) {
		// http://username:password@site
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.close();
	}

}
