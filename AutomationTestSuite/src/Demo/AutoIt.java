package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.findElement(By.id("input_resumeParser")).click();
		
		
		
		Runtime.getRuntime().exec("‪C:/Users/Lenovo/Downloads/Files.exe");
		
	}

}
