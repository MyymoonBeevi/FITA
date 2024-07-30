package edureka;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebElementCommands extends browser{
	
	
	public void webElemCommandsDemo() {
		WebElement email = driver.findElement(By.id("email"));
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		WebElement MaleRadbtn = driver.findElement(By.xpath("//label(Starts-with(@class,'_58mt')"));
		
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement Signup = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Up"))));
		
		
		FluentWait<WebDriver> waitnew = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
		//fetching the details
		//get attribute
//		String placeholder = email.getAttribute("placeholder");
//		System.out.println(placeholder);
		
		//get tool tip
//		System.out.println(instaLink.getAttribute("title"));
		
		//get text
//		System.out.println(welMsg.getText());
		
		//get tagname
//		System.out.println("email id's tagname = " + email.getTagName());
		
		//get location
//		System.out.println("login button location (Point)  = " + loginBtn.getLocation());
//		System.out.println("login button location (Point X)  = " + loginBtn.getLocation().x);
//		System.out.println("login button location (Point Y)  = " + loginBtn.getLocation().y);
		
		//get size
//		System.out.println("login button size (dimension) = " + loginBtn.getSize());
//		System.out.println("login button size (dimension heigth) = " + loginBtn.getSize().height);
//		System.out.println("login button size (dimension width) = " + loginBtn.getSize().width);
		
		//get css value
//		System.out.println("font size of login button = " + loginBtn.getCssValue("font-size"));
		
		//actions
		
		//loginBtn.click();
		//email.sendKeys("ss@gmail.com");
		//email.clear();
		
		
		//status
		
		//System.out.println(email.isDisplayed());
		
		//System.out.println("is email element enabled =  " +email.isEnabled());
		
		//System.out.println(loginBtn.isSelected());
		
		
	
		MaleRadbtn.click();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
	
	
	}

	public static void main(String[] args) {
		WebElementCommands obj = new WebElementCommands();
		obj.setupBrowser("chrome", "http://157.240.192.35");
		obj.webElemCommandsDemo();
	}

}
