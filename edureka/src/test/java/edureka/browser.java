package edureka;
import org.openqa.selenium.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
	WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		//opening the browser
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("valid browser is not provided, hence quitting this automation run.");
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		
		//implicit wait
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//page load timeout it is defined in page object model
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		//script load timeout
		
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		//opening the url
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}

