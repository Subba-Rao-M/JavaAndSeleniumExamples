package introductionSelenumWD.windowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleBrowserWindowsDemo_2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set <String> windowIds= driver.getWindowHandles();
		
		//Approach 2 - convert set to list
		
		for(String windowid : windowIds ) {
			String title = driver.switchTo().window(windowid).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")){
			System.out.println("Inside if condition");
			//Some action related to this browser window performed and other windows ignored
			System.out.println("Current URL : "+driver.getCurrentUrl());
			}
			else if(title.equals("Human Resources Management Software | OrangeHRM") || title.equals("Title")) {
				driver.close();
			}
			
		}
		
		driver.close();
		
	}

}
