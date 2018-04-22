package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightingElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");
		
		WebElement element1 =driver.findElement(By.id("email"));
		Helper.higlight(driver,element1);
		element1.sendKeys("vignesh.vicks571@gmail.com");
		
		WebElement element2 =driver.findElement(By.id("pass"));
		Helper.higlight(driver,element2);
		element2.sendKeys("greenlantons");
		
		WebElement element3=driver.findElement(By.id("loginbutton"));
		Border.higlightborder(driver,element3);
	}
	
	public static class Helper
	{
		
		public  static void higlight(WebDriver driver,WebElement element) throws InterruptedException
		{
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:2px solid red;');", element);
			Thread.sleep(3000);
			js.executeScript("arguments[0].setAttribute('style', 'background: white; border:2px solid white;');", element);
			
		}
	}
		
		public static class Border
		
		{
			
			public  static void higlightborder(WebDriver driver,WebElement element) throws InterruptedException 
			
			{
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].setAttribute('style', 'border: white; border:2px solid red;');", element);
			
		}
		
	
				
	}

}
