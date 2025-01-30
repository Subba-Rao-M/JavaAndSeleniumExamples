package browserDevTools;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.fetch.Fetch;
import org.openqa.selenium.devtools.v116.network.Network;
import org.openqa.selenium.devtools.v116.network.model.Request;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDevTools_NetworkMocking {


	public static void main(String[] args) throws InterruptedException {
		
	
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools= driver.getDevTools();
		devTools.createSession();
		devTools.send(Fetch.enable(java.util.Optional.empty(), java.util.Optional.empty()));
	
		devTools.addListener(Fetch.requestPaused(), request ->
		{
			if(request.getRequest().getUrl().contains("shetty")) {
				String mockURL = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				System.out.println(mockURL);
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockURL),java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
			}
			else {
				devTools.send(Fetch.continueRequest(request.getRequestId(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
			}
		
			
		}	
				);
	
		devTools.addListener(Network.responseReceived(), response ->
		{
			org.openqa.selenium.devtools.v116.network.model.Response res = response.getResponse();
			//System.out.println(res.getUrl()+" "+res.getStatus());
			if(res.getStatus().toString().startsWith("4")) {
				System.out.println(res.getUrl()+" is failing with status code "+res.getStatus());
			}
			
		}	
				);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
	}

}
