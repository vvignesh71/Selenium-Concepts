package Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total Count of images and links : " + list.size());
		
		List<WebElement> activelink = new ArrayList<WebElement>();
		
		for(int i =0; i<list.size() ;i ++)
			
		{
			
			if(list.get(i).getAttribute("href")!=null)
			{
				activelink.add(list.get(i));
				
			}
		}
		
		System.out.println("Actual Count of  images and links : " + activelink.size());
		
		for(int j=0 ; j<activelink.size() ; j++)
		{
			
			HttpURLConnection connection =		(HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelink.get(j).getAttribute("href") + "------->"+ response);
			
		}
		
	}

}
