package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://spicejet.com/Default.aspx");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Actions action = new Actions(driver);
			
			action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
			
		
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("SpiceClub Membership Offer")).click();
			
			
			
			driver.get("https://www.naukri.com/");
			
			Actions action1 = new Actions(driver);
			
			action1.moveToElement(driver.findElement(By.xpath("//span[@class='topIcon jobs']"))).build().perform();
			
		
			
			Thread.sleep(4000);
			
			driver.findElement(By.linkText("Browse All Jobs")).click();
			
			
		}

	}


