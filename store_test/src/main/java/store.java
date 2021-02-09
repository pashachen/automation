import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class store {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        try {

            driver.get("https://www.traektoria.ru/");
            Thread.sleep(2000);

            WebElement element1 = driver.findElement(By.xpath("//a[text()='Лонгборд']"));
            element1.click();
            WebElement element2 = driver.findElement(By.xpath("//div[@data-property_code='SECTIONS']/div[@class='trigger']"));
            element2.click();
            WebElement element3 = driver.findElement(By.xpath("//span[text()='Лонгборды и круизеры']"));
            element3.click();
            WebElement element4 = driver.findElement(By.xpath("//div[@id='bx_3966226736_993268']"));
            element4.click();
            WebElement element5 = driver.findElement(By.xpath("//div[@class='buy_btn']"));
            element5.click();
            WebElement wait = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Корзина: 1 товар')]"))));
            WebElement element6 = driver.findElement(By.xpath("//a[contains(text(),'Корзина')]"));
            element6.click();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
