package qaSDET.testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public Properties prop;
	
	@BeforeClass(groups = {"Sanity", "Regression", "Master", "DataDriven"}, alwaysRun = true)
	@Parameters({"os","browser"})
	public void setUp(String os, String browser) throws IOException {
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		prop = new Properties();
		prop.load(file);
		
		System.setProperty("log4j.configurationFile",System.getProperty("user.dir")+"\\src\\test\\resources\\log4j2.xml");
		logger = LogManager.getLogger(this.getClass());
		System.out.println("Logger Initialized: " + (logger != null));
		
		if(prop.getProperty("execution_env").equalsIgnoreCase("remote")) {
			logger.info("Remote environment execution");
			logger.info("Test execution starts from remote machine");
			String hubURL= "http://localhost:4444/wd/hub";
			
			DesiredCapabilities cap = new DesiredCapabilities();
			if(os.equalsIgnoreCase("windows")) {
				cap.setPlatform(Platform.WIN11); 
			}
			else if(os.equalsIgnoreCase("mac")) {
				cap.setPlatform(Platform.MAC); 
			}
			else if(os.equalsIgnoreCase("linux")) {
				cap.setPlatform(Platform.LINUX); 
			}
			else {
				System.out.println("No matching os");
				logger.info("Invaid OS passed");
				return;
			}
			
			switch(browser.toLowerCase()) {
			
			case "edge" : 	cap.setBrowserName("MicrosoftEdge"); break;
			case "chrome" : cap.setBrowserName("chrome"); break;
			case "firefox" : cap.setBrowserName("firefox"); break;
			//case "Safari" : cap.setBrowserName("safari"); break;
			default: System.out.println("Invalid Browser Name ***"); return;
			}
			
			driver = new RemoteWebDriver(new URL(hubURL), cap);
		}
			
		else if(prop.getProperty("execution_env").equalsIgnoreCase("local")) {
			logger.info("Local environment execution");
			switch(browser.toLowerCase()) {
			case "edge" : 	
							driver = new EdgeDriver(); break;
			case "chrome" : 
							ChromeOptions capbs = new ChromeOptions();
	        				capbs.addArguments("--remote-allow-origins=*");
	        				capbs.setAcceptInsecureCerts(true);
	        				driver = new ChromeDriver(capbs);
	        				break;
			default: System.out.println("Invalid Browser Name ***"); return;
			
			}
		}
		else {
			System.out.println("Enter valid execution environment");
			return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups = {"Sanity", "Regression", "Master", "DataDriven"}, alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
	private String generatedAlphaNo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomNumber() {
		String generatedNo = RandomStringUtils.randomNumeric(10);
		return generatedNo;
	}
	
	public String randomAlpaNum() {
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(3);
		return (generatedstring+"@"+generatednumber);
		
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
}
