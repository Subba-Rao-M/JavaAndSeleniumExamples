package introductionSelenumWD.keyboardactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenNewWindowDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://awesomeqa.com/ui/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://awesomeqa.com/ui/index.php?route=account/return/add");
		//Control will be in 2nd tab due to switch command
		driver.manage().window().maximize();
		
		//To open in new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://awesomeqa.com/ui/index.php?route=information/information&information_id=3");
	}

}
