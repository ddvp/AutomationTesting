

import org.example.SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NavFirefox{

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASPIREV5\\Desktop\\Resource\\driver-v1\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://todoist.com/es");

            SignIn Login = new SignIn(driver);
            Login.getSignIn().click();

            Login.getUsername().sendKeys("diana@test.com");
            Thread.sleep(3000);
            Login.getPassword().sendKeys("test comments");
            Login.getButton().click();

            Assert.assertEquals(driver.getCurrentUrl(), "https:todoist.com/es");
            String ErrorMessage = driver.findElement(By.cssSelector("ErrorMessage")).getText();
            Assert.assertEquals("Email o contraseña incorrectos." , ErrorMessage);

            driver.close();
        }
}

