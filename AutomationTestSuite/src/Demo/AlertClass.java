package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		
		Alert a1 =driver.switchTo().alert();
		
		//a1.accept();
		
		String s1=a1.getText();
		
		System.out.println(a1.getText());
		
		String s2="Please enter a valid user name";
	   
		if(s1.equals(s2))
		   
		   
		{
			System.out.println("success");
			
		}
		
		
		else
		{
			System.out.println("Fail");
			
		}
		
		a1.accept();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		
		driver.findElement(By.name("submit")).click();
		
		Alert a2 = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		a2.dismiss();
		
		
	}
	

}
