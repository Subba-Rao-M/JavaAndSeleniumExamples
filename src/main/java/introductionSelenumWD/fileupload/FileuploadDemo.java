package introductionSelenumWD.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FileuploadDemo {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\raooosub\\Downloads\\New Text Document.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("New Text Document.txt")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		
		//To upload 2 files
		
		String file1 = "C:\\Automation_Projects\\MyGitExample\\a.txt";
		String file2 = "C:\\Automation_Projects\\MyGitExample\\b.txt";
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
		int nooffiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(nooffiles==3) { //+1 from first single file upload
			System.out.println("Test Pass"); 
		}
		else {
			System.out.println("Test Fail");
		}
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("New Text Document.txt")
				&&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("a.txt")
				&&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[3]")).getText().equals("b.txt")
				)
		
		
		{
			System.out.println("Test file names verified");
		}
		else {
			System.out.println("Test Fail");
		}
		

	}

}
