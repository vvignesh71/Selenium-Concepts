package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Downloads//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com"); 
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button
		
		
		flash(loginBtn, driver); 
		
		drawBorder(loginBtn, driver); 
		
		
		
		
	}
	
	
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }
	
	
    public static void drawBorder(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
    
    public static void generateAlert(WebDriver driver, String message){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("alert('"+message+"')");
	}

}
