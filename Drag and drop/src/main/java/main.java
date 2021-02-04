import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;



public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();

        } catch
            (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
// WebElement element = driver.findElement(By.xpath("//input[@title='Поиск']"));
// element.sendKeys("Негр ты долбоеб?", Keys.ENTER);

// WebElement images = driver.findElement(By.xpath("//a[@class='hide-focus-ring']"));
// images.click();