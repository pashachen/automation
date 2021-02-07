import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://www.google.com");

            WebElement element = driver.findElement(By.xpath("//a[text()='Войти']"));
            Thread.sleep(2000);
            element.click();

            WebElement login = driver.findElement(By.xpath("//input[@type='email']"));
            login.sendKeys("введите_логин");  //enter login here

            WebElement next = driver.findElement(By.xpath("//span[text()='Далее']/../../button[@type='button']"));
            next.click();

            WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            password.sendKeys("введите_пароль", Keys.ENTER);  //enter password here

        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }

}
