package test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.*;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_Test {
	
	WebDriver driver;
	
  @Test
  public void method() {
	  
	
	  
	  
  }
  
  @Test
  public void method1() {
	  
	  System.out.println("This is from the function2");
	  
	  
  }
  @Test
  public void method2() {
	  
	  System.out.println("This is from the function3");
	  
	  
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is from the before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is from the after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is from the before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is from the after class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This is from the before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is from the after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is from the before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is from the after suite");
  }

}
