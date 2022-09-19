import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LogIn {
    static {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\anil.boyapati\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }
    WebDriver driver;
    
    @Test(priority = 1)
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mobileworld.banyanpro.com/");
        Thread.sleep(1000);
        driver.findElement(By.className("my-2")).click();
    }





  @Test(priority = 2)
    public void enterUserName() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("Anil");
    }





  @Test(priority = 3)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys("ab@123");
        Thread.sleep(3000);
    }





  @Test(priority = 4)
    public void clickOnLogin() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Log In']")).click();
    }
}