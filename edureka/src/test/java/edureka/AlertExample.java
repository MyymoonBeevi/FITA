package edureka;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertExample extends browser {

	public void AlertDemo() {
		
		WebElement prbtn = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		prbtn.click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().sendKeys("Dee");
		
		
		
		
	}
	
	
	public void SimpleAlert() {
		
		WebElement Alert_Button = driver.findElement(By.xpath("//button[contains(text(), 'Alert')]"));
		
		Alert_Button.click();
		
	    Alert SimpAlert =	driver.switchTo().alert();
	
		String msg = driver.switchTo().alert().getText();
		
		System.out.println(msg);
		
		driver.switchTo().alert().accept();
		
	}
	
	public void prompt() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement Alert_Button = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(), 'Prompt')]"))));
		
		
		
        
		Alert_Button.click();
		
	 Alert WebAlert = driver.switchTo().alert();
	 WebAlert.getText();
	 WebAlert.sendKeys("i live prika");
	 WebAlert.accept();
	 Alert_Button.click();
	 WebAlert.dismiss();
		
	
		
	}
	
	
	public void Modal() {
		
		WebElement Login_bt = driver.findElement(By.xpath("//span[@data-button-name='Login']"));
		Login_bt.click();
		
		WebElement email_id = driver.findElement(By.name("email"));
		 email_id.isDisplayed();
		
		WebElement password = driver.findElement(By.id("si_popup_passwd"));
		
		
		System.out.println(password.isDisplayed());
		
		password.sendKeys("pass");
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		
		AlertExample obj = new AlertExample();
		obj.setupBrowser("chrome", "https://www.edureka.co");
		//obj.AlertDemo();
		//obj.SimpleAlert();
		//obj.prompt();
		obj.Modal();
		

	}

}
