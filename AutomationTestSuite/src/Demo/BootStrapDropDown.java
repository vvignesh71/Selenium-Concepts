package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//driver.findElement(By.cssSelector("button[type='button']")).click();
		
	List <WebElement>	li = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		
		System.out.println(li.size());
		
		for(int i=0 ; i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
			if(li.get(i).getText().contains("Angular"))
				li.get(i).click();
			
		}
	}

}
