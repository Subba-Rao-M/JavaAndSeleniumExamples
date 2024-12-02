package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadingPropertiesFileDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Create class for Properties class
		Properties prop = new Properties();
		
		//Read the the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\\\java\\datadriventesting\\testdata\\config.properties");

		//Load the properties file
		prop.load(file);
		
		// Get the data from properities file
		
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Reading only the key values from properites value
		
		//Approach 1
		Set <String> keyvals =prop.stringPropertyNames();
		
		for(String key:keyvals ) {
			System.out.println("Approach1"+key);
		}
		
		//Approach 2
				Set <Object> Keys =prop.keySet();
				
				for(Object key1:Keys ) {
					System.out.println("Approach2"+key1);
				}
		
		//Reading all values from properties file
				Collection <Object> vals =prop.values();
				System.out.println("Values"+vals);
				
				
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder ='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder ='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Test Passed");
		driver.close();
		
		file.close();
		
	}

}
