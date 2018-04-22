package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Type about:config in Google URL>Enter>Type as savetodisk and you will get as 'browser.helperApps.neverAsk.saveToDisk;application/java-archive'
		//2.Go to this site https://www.sitepoint.com/mime-types-complete-list/ and find prefrence and value for file you want to download by typing its extension
		//3.Here for jar cntrl+f type .jar ,you will get value as application/java-archive or search in google value for jar files
				
			    FirefoxProfile p1 = new FirefoxProfile();
				p1.setPreference("browser.helperApps.neverAsk.saveToDisk","application/java-archive"); //It will get saved in Download folder by default
			  	WebDriver driver = new FirefoxDriver(p1);
				driver.get("http://www.seleniumhq.org/download/");
		        driver.findElement(By.linkText("3.7.1")).click();
		        
		        
		 //2.To download in Desktop we give value as 0       
		          FirefoxProfile p2 = new FirefoxProfile();
		          p2.setPreference("browser.helperApps.neverAsk.saveToDisk","application/java-archive");
		          
		// In the site ttps://www.sitepoint.com/mime-types-complete-list/ just type folder you will get as 'browser.download.folderList'         
		          p2.setPreference("browser.download.folderList", 0);  //If we want to download in someother folders other than downloads we need to type as folder in that site
		          WebDriver driver1 = new FirefoxDriver(p2);
				
				driver1.get("http://www.seleniumhq.org/download/");
		        driver1.findElement(By.linkText("3.7.1")).click();
		        
		//3.To download in specific location we give value as 2   
		        
		        FirefoxProfile p3 = new FirefoxProfile();
		        p3.setPreference("browser.helperApps.neverAsk.saveToDisk","application/java-archive");
		        
		   // In sitepoint site type as folder you will get as browser.download.folderList and for specific location we give value as 2
		        
		        p3.setPreference("browser.download.folderList", 2);
		        
		        p3.setPreference("browser.download.dir", "G:\\Testing");  //Change to dir and specify path where to be downloaded
		        
		 WebDriver driver3 = new FirefoxDriver(p3);
				
				driver3.get("http://www.seleniumhq.org/download/");
		        driver3.findElement(By.linkText("3.7.1")).click();
		        
		        
			}

}
	


