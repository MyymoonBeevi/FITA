package edureka;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptException;
public class Actions extends browser {

	public void youtube() {
		setupBrowser("chrome", "https://www.youtube.com/results?search_query=docker");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(500, 3000)");
		
		
		
		}
	public void githubExample() {
		setupBrowser("chrome", "https://www.github.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
		
	}
	public void amazonExample() {
setupBrowser("chrome", "https://www.amazon.in/Midnight-Toughest-Featured-SUPERVOOC-Additional/dp/B0D53M1ZQX?ref=dlx_deals_dg_dcl_B0D53M1ZQX_dt_sl10_2a&th=1");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement det = driver.findElement(By.xpath("//h2[contains(text(),'desc')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", det);
	}
	public static void main(String[] args) {
		
     
		
		Actions obj = new Actions();
		
		obj.amazonExample();
		
	}

}
