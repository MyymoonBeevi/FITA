package co.edurekatraining;
import org.openqa.selenium.*;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class Assignment4 extends Main {
	
	public void Rediff() {
		
		driver.manage().window().fullscreen();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Signin = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class = 'signin']"))));
		Signin.click();
		
		WebElement sgbtn = driver.findElement(By.xpath("//input[@class = 'signinbtn']"));
		sgbtn.click();
		
		System.out.println("The Alert Text is  " +driver.switchTo().alert().getText());
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
	}
	
	public void demoqa() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement Tabbtn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id = 'tabButton']"))));
		
		Tabbtn.click();
		
		WebElement winbtn = driver.findElement(By.xpath("//button[@id ='windowButton']"));
		winbtn.click();
		
		driver.switchTo().defaultContent();
		
		WebElement messbtn = driver.findElement(By.xpath("//button[@id ='messageWindowButton']"));
		
		messbtn.click();
		String currhandle = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String MainWindowId = itr.next();
		System.out.println("Main window id is  " +MainWindowId);
		String ChildWindowId = itr.next();
		System.out.println("Main window id is  " +ChildWindowId);
		driver.switchTo().window(ChildWindowId);
		System.out.println("The child id is " +driver.getTitle());
		driver.switchTo().window(MainWindowId);
		System.out.println("The main id is " +driver.getTitle());
		System.out.println("The total window count size is  " +driver.getWindowHandles().size());
		
		
	}
	
	public void quitbrowser() {
		
		driver.quit();
		
	}
	
	

	public static void main(String[] args) {
	
		Assignment4 obj1 = new Assignment4();
		obj1.browsersetup("chrome", "https://www.rediff.com");
		obj1.Rediff();
		obj1.quitbrowser();
		Assignment4 obj2 = new Assignment4();
		obj2.browsersetup("chrome", "https://demoqa.com/browser-windows");
		obj2.demoqa();
		obj2.quitbrowser();
		
		

		
		
		
		
	}

}
