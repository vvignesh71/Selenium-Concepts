package Demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//div[text()='Recruiters']")).click();
		
	
	Set<String> s1 = driver.getWindowHandles();
	
 Iterator<String> it = s1.iterator();
	
	String str =it.next();
	
	String str2 = it.next();
	
	driver.switchTo().window(str2);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id='qsbFormBtn']")).click();
	
	
	

	}

}
