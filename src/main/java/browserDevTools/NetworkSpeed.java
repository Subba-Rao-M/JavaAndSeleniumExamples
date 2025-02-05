package browserDevTools;

import java.util.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.network.Network;
import org.openqa.selenium.devtools.v116.fetch.Fetch;
import org.openqa.selenium.devtools.v116.network.model.ConnectionType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkSpeed {

    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        try {
            // Get DevTools and create session
            DevTools devTools = driver.getDevTools();
            devTools.createSession();

            // Enable Fetch domain
            devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));

            // Emulate network conditions
            devTools.send(Network.emulateNetworkConditions(
                    true,  // Offline
                    3000,  // Latency in ms
                    20000, // Download Throughput in bps
                    100000, // Upload Throughput in bps
                    Optional.of(ConnectionType.ETHERNET) // Connection Type
            ));

            // Listen for network loading failures
            devTools.addListener(Network.loadingFailed(), loadingFailed -> 
                System.out.println("Loading failed: " + loadingFailed.getErrorText())
            );

            // Measure execution time
            long startTime = System.currentTimeMillis();

            driver.get("https://rahulshettyacademy.com/angularAppdemo/");
            driver.findElement(By.cssSelector("button[routerlink*='library']")).click();

            long endTime = System.currentTimeMillis();
            long execTime = endTime - startTime;
            System.out.println("Execution Time: " + execTime + " ms");

        } finally {
            // Ensure driver is closed properly
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
