package co.edurekatraining;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = {"Regression"}) //default grouping
public class beforeAfterMethods {
@Test
public void Test1() {
	int a = 99;
     assertTrue(a < 10);
  Reporter.log("Thivya");	
	
Reporter.log("enums");

Reporter.log("Guru is god");



}

public void Test2() {
	
	
	
}
	
@BeforeMethod

public void beforemeth() {
	
	System.out.println("This has to be executed before method");
	
}

@BeforeTest
public void beforeTest() {
	
	System.out.println("This has to be executed before Test");
	
}
	
@BeforeClass

public void beforeClass() {
	
	System.out.println("This has to be executed before Class");
	
}

@BeforeSuite
public void beforeSuite() {
	
	System.out.println("This has to be executed before Suite");
	
}

@BeforeGroups
public void beforeGroups() {
	
	System.out.println("This has to be executed before Groups");
	
}

@AfterClass
public void afterClass() {
	
	System.out.println("This has to be executed after Class");
	
}

@AfterGroups
public void afterGroups() {
	
	System.out.println("This has to be executed after Groups");
	
}

@AfterMethod
public void afterMeth() {
	
	System.out.println("This has to be executed after method");
	
}

@AfterSuite
public void afterSuite() {
	
	System.out.println("This has to be executed after Suite");
	
}

@AfterTest
public void afterTest() {
	
	System.out.println("This has to be executed after Test");
	
}



	
}
