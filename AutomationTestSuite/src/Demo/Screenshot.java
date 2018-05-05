package Demo;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

       driver.manage().window().maximize();
       
		driver.get("http://www.careerride.com/view/software-tester-career-objective-and-career-summary-14518.aspx");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		EventFiringWebDriver  e1 = new EventFiringWebDriver (driver);
		
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		
		
		File f2 = new File("H:\\Testing\\screens.png");
		
		FileUtils.copyFile(f1, f2);
		
		
		EventFiringWebDriver e2 = new EventFiringWebDriver(driver);
		
		File f3 = e2.getScreenshotAs(OutputType.FILE);
		
		
	

	}
	}


