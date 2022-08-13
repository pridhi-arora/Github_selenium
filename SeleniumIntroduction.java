import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", 
    		"C:\\Users\\pridh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
    driver.get("https://github.com/");
    driver.findElement(By.xpath("//a[@href='/login']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    driver.findElement(By.id("login_field")).sendKeys("pridhi-arora");
    driver.findElement(By.id("password")).sendKeys("github17");
    driver.findElement(By.name("commit")).click();
    driver.findElement(By.linkText("Create a new repository")).click();
    driver.findElement(By.id("repository_name")).sendKeys("repo");
    driver.findElement(By.id("repository_description")).sendKeys("description");
    driver.findElement(By.id("repository_auto_init")).click();
    driver.findElement(By.xpath("//input[@value='public']")).click(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,700)");
    //driver.findElement(By.xpath("//div/hr/following-sibling::button")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//*[@id='new_repository']/div[5]/button")).click();
    System.out.println("Repository created");
    
    
	}

}

