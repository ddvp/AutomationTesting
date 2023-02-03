

import junit.framework.Assert;
import org.example.SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class NavEdge {

        public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.Edge.driver", "C:\\Users\\ASPIREV5\\Desktop\\Resource\\driver-v1\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
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
