
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test_selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");
        driver.manage().window().maximize();
        driver.findElement(By.id("mailbox:login")).sendKeys(" YOUR USER NAME");
        driver.findElement(By.id("mailbox:password")).sendKeys("YOUR PASSWORD");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("mailbox:submit")).click();
        driver.findElement(By.id("mailbox:login")).clear();
        driver.findElement(By.id("mailbox:login")).sendKeys("vitall96@mail.ru");
        driver.findElement(By.id("mailbox:password")).sendKeys("dbnfkbr9696v");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("mailbox:submit")).click();
        driver.close();
    }
}