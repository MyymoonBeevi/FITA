package co.edurekatraining;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;

public class Main {

	
	WebDriver driver;
	
	
	public void browsersetup(String browser, String url) {
		
		
		
		if(browser.equalsIgnoreCase("chrome"))
		   {
			
			 driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
			
		}
		
        else if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
		}
        else {
        	
        	System.out.println("please enter valid credentials");
        	System.exit(0);
        }
		
		
		if(url!=null) {
			driver.get(url);
		}
		
		else {
			driver.get("about:blank");
			
		}
		
		
		
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		
		Main obj = new Main();
		
		obj.browsersetup("ChromE","https:www.google.com");
		
		obj.quitBrowser();

	}

}
