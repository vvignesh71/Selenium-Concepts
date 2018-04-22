package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		
		
	List <WebElement> list  = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	
	Thread.sleep(5000);
	
	System.out.println(list.size());
	
	for (int i=1; i<list.size();i++)
		
	{
	if(list.get(i).getText().contains("testing concepts"))
	{
		list.get(i).click();
	}
	
		
	


	}

}
	
}
