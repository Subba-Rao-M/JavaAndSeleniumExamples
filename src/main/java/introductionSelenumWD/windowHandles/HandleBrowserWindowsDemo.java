package introductionSelenumWD.windowHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleBrowserWindowsDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set <String >windowIds= driver.getWindowHandles();
		
		//Approach 1 - convert set to list
		
		List<String> windowsList = new ArrayList(windowIds);
		
		String parentid = windowsList.get(0);
		String childid = windowsList.get(1);
		
		System.out.println("Parent window : "+driver.getTitle());
		
		//Switch to Child window
		driver.switchTo().window(childid);
		
		System.out.println("Child Window : "+driver.getTitle());
		
		//Switch to Parent to window again
		driver.switchTo().window(parentid);
		
		System.out.println("Again Parent window : "+driver.getTitle());
	}

}
