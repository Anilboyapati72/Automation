import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LogUp {
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
    }







  @Test(priority = 2)
    public void clickOnSignUp() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
        driver.findElement(By.xpath("//a[text()='Sign up']")).click();
    
    }







  @Test(priority = 3)
    public void enterFirstName() throws InterruptedException {
        driver.findElement(By.id("myName")).sendKeys("Anil");
    }







  @Test(priority = 4)
    public void enterLastName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Boyapati");
    }







  @Test(priority = 5)
    public void enterMail() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("anilboyapati12@gmail.com");
    }







  @Test(priority = 6)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ab@7721");
    }
   @Test(priority = 7)
   public void enterDOB() throws InterruptedException {
       driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05/09/2001");
   }







 @Test(priority = 8)
   public void selectGender() throws InterruptedException {
	 driver.findElement(By.cssSelector("div[class='col-md-2'] input[name='gender']")).click();
   }







 @Test(priority = 9)
   public void enterPhoneNumber() throws InterruptedException {
       driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9381372264");
   }







 @Test(priority = 10)
   public void clickOnRegister() throws InterruptedException {
       driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(" Welcome to Qualitest");
       driver.findElement(By.xpath("//button[text()='Register']")).click();
       driver.switchTo().alert().accept();
       Thread.sleep(1000);
   }



  }