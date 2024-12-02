package introductionSelenumWD.webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWebTable_Demo_1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/**
		 * Find total number of rows in a table using tr's available under table
		 * Use size option to get count
		 */
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//int rows = driver.findElements(By.tagName("tr")).size(); // Use this only if you have single table in web page
		System.out.println(" Number of element in a row : "+rows);
		
		/**
		 * Find total number of columns in a table using first tr table using th/td tags
		 * Use size option to get count
		 */
		
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		//int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // Since no other th in page
		//int cols = driver.findElements(By.tagName("th")).size(); // If single table in web page since it counts th from all tables
		System.out.println(" Number of element in a row : "+cols);
		
		
		// TO find the value in 5th row in first column
		
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookname);
		
		String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println(subject);
		
		//Read all the data from table
		
		for(int r=2; r<=rows; r++) { // r starts from 2 since 1 is header and header contains th tag
			for(int c=1; c<=cols; c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText(); // refer syntax for r and c as index
				System.out.print(value+"\t"); // print to print in same line
			}
			System.out.println(); // To move to next line
		}
		
		
		
		//Print Book Name whoose author is Mukesh
		for(int r=2; r<=rows; r++) { 
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText(); // 2nd column refers to author name for each row
			//System.out.println("Author Name : \t"+authorName);
			
			if(authorName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText(); // Get Book name column value from col1
				System.out.println("Book Name : "+bookName+" ||  \t Author Name : "+authorName);
			}
		}
		
		//Print the total price of all books
		
		int totalprice = 0;
		for(int r=2; r<=rows; r++) { 
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText(); // 4th column has price in string format
			totalprice= totalprice+Integer.parseInt(price);
		}
		System.out.println("\n Total Price of All Books : "+totalprice);
		
		
	}
}
