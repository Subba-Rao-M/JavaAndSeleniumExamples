package browserDevTools;
import java.net.URI;
import java.util.function.Predicate;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;

public class AuthenticationTest {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        try {
            // Define URI predicate for authentication
            Predicate<URI> uriPredicate = uri -> uri.getHost().contains("httpbin.org");

            // Register authentication credentials
            ((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("foo", "bar"));

            // Navigate to the protected page
            driver.get("http://httpbin.org/basic-auth/foo/bar");
            
            // Add verification logic here if needed

        } finally {
            // Ensure driver is closed properly
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
