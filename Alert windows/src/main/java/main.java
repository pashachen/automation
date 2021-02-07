import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class main {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, 1000);




        try {
            driver.get("file:///C:/Idea_projects/website/index.html");
            Thread.sleep(5000);

            WebElement element1 = driver.findElement(By.id("a"));
            WebElement element2 = driver.findElement(By.id("b"));
            WebElement element3 = driver.findElement(By.id("c"));

            element1.click();

            Alert alert = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert.accept();

            element2.click();
            Alert prompt = wait.until(alertIsPresent());

            prompt.sendKeys("Input test");
            Thread.sleep(2000);
            prompt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert2.accept();

            element3.click();
            Alert alert3 = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert3.dismiss();

        }


        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
