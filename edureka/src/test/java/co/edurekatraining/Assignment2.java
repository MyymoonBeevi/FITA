package co.edurekatraining;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;


public class Assignment2 extends Main{

	
	public void Money() {
		//Class
		//System.out.println("Inspecting the Money element using class locator");
		//driver.findElement(By.className("moneyicon")).click();
		
		
		//xpath
		//System.out.println("Inspecting the Money element using xpath locator");
		//driver.findElement(By.xpath("//a[starts-with(@class, 'moneyicon')]")).click();
	
	   //CSS
		System.out.println("Inspecting the Money element using CSS locator");
		driver.findElement(By.cssSelector("a.moneyicon")).click();
		
		
		
	
	}
	
	public void txt() {
		
		driver.findElement(By.id("srchquery_tbox")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("srchquery_tbox")).sendKeys("hot@gmail.com");
		
	}
		public void insp_elem() {
			
			//rediffmail
			driver.findElement(By.cssSelector("a.mailicon")).click();
			
			//enterprise email
			driver.findElement(By.partialLinkText("Enterprise")).click();
			
			//businessemail
			driver.findElement(By.partialLinkText("Business")).click();
			
			//shopping
			driver.findElement(By.partialLinkText("Shopping")).click();
			
			//sign in
			driver.findElement(By.partialLinkText("Sign")).click();
			
			//create account
			driver.findElement(By.partialLinkText("Create")).click();
			
		}
		
	public void signin() {
		
		driver.findElement(By.partialLinkText("Sign")).click();
	
		
	}
	
	
	public static void main(String[] args) {
		
		Assignment2 obj = new Assignment2();
		obj.browsersetup("chrome", "https://www.rediff.com/");
		//obj.Money();
		obj.insp_elem();
		obj.signin();

	}

}
