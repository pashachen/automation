import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class main {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, 1000);

        try {
            driver.get("file:///C:/Idea_projects/website/index.html");
            Thread.sleep(5000);

            LoginPage lp = new LoginPage();
            lp.login("admin", "admin");
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        finally {
            Thread.sleep(10000);
            driver.quit();
        }
    }
}
