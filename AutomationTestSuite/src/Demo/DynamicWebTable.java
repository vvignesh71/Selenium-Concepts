package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/dailygroupa/groupb");
		
		
		//  //*[@id='leftcontainer']/table/tbody/tr[1]/td[1]/a
		//  //*[@id='leftcontainer']/table/tbody/tr[3]/td[1]/a
		//  //*[@id='leftcontainer']/table/tbody/tr[4]/td[1]/a
		//  //*[@id='leftcontainer']/table/tbody/tr[5]/td[1]/a
			
		String beforexpath= "//*[@id='leftcontainer']/table/tbody/tr[";
		String afterxpath="]/td[1]/a";
				
		for(int i=1 ;i <=5 ;i++)
			
		{
			
		String str = driver.findElement(By.xpath(beforexpath + i + afterxpath)).getText();
		
		System.out.println(str);
		
		if(str.contains("Lemon Tree Hotels"))
		{
			driver.findElement(By.xpath(beforexpath + i + afterxpath)).click();
			
			
		}
			
		}
	
	}
	}
