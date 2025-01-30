package browserDevTools;

import java.util.HashMap;
import java.util.Map;

import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.network.Network;
import org.openqa.selenium.devtools.v116.network.model.Request;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDevTools_NetworkActivity {


	public static void main(String[] args) throws InterruptedException {
		
	
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools= driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(java.util.Optional.empty(), java.util.Optional.empty(), java.util.Optional.empty()));
		devTools.addListener(Network.requestWillBeSent(), request ->
		{
			Request req = request.getRequest();
			System.out.println(req.getUrl());
			
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
	}

}
