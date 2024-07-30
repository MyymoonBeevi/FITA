package edureka;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import edureka.browser;

public class FileHandling extends browser {
	
	
	public void fileupload() {
		
		WebElement uploadButton = driver.findElement(By.xpath("//a[contains(text(),'Start')]"));
		
		uploadButton.click();
		
	}

	public static void main(String[] args) {
		
		
		FileHandling object = new FileHandling();
		
		object.setupBrowser("chrome", "https://imgbb.com/");
		
		object.fileupload();
		
		object.getClass();
		
		object.createnewatmos();
		

	}
            
}           