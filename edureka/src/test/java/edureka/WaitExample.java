package edureka;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample extends browser{
	
	public void explicitWaitExample() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement email = driver.findElement(By.id("email"));
		WebElement email = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		email.sendKeys("guru@gmail.com");
		
	}
	
	
	

	public static void main(String[] args) {
		WaitExample obj = new WaitExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.explicitWaitExample();
	}

}

