package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();

		
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.id("continents")));
		
		
		s1.selectByIndex(4);
		
		s1.selectByVisibleText("North America");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Select select = new Select(driver.findElement(By.id("month")));
		//s1.selectByIndex(1);
		Thread.sleep(4);
		 // s1.selectByValue("3");
		
		select.selectByVisibleText("Mar");
		
		driver.manage().window().maximize();

		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		Select selecting = new Select(driver.findElement(By.id("awf_field-91977689")));
		
		selecting.selectByIndex(2);	
	}

}
