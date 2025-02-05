package browserDevTools;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.fetch.Fetch;
import org.openqa.selenium.devtools.v116.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v116.network.model.ErrorReason;

public class NetworkFailedRequest {
/***
 * network request is forcefully failed to simulate edge cases for test scenarios
 *n
 */
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools= driver.getDevTools();
		devTools.createSession();
		Optional<List<org.openqa.selenium.devtools.v116.fetch.model.RequestPattern>> pattern = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), java.util.Optional.empty(), java.util.Optional.empty())));
		devTools.send(Fetch.enable(pattern, java.util.Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request->
		{
					devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
	
		}	
				
				);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		Thread.sleep(3000);

	}

	

}
