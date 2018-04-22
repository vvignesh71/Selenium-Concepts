package Demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropDownList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Experience']")).click();
		
		Thread.sleep(5000);
		
		List <WebElement> list  = driver.findElements(By.xpath("//div[@id='home-lang']//ul//li//span"));
		
		System.out.println(list.size());
		
		for(int i=0 ; i < list.size();i++)
			
		{
			
			System.out.println(list.get(i).getText());
			
			
			
			
			if(list.get(i).getText().equals("2"))
					{
				list.get(i).click();
					}
			
			
		}
		
}

}
