package co.edurekatraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
@Test(groups = {"Regression"})
public class NewTest {

 @Test()
 
 public void Testcase() {
	 
	 
 }
	
@Test(groups = {"Regression"}, priority = 1, enabled = true)
public void tc1() {
	System.out.println("test case 1");
	SoftAssert sa = new SoftAssert();
	int a = 47;
	sa.assertTrue(a>9, "Assert");
	sa.assertFalse(a>=100, "condition false");
	sa.assertEquals(a = 45, a=45);
	System.out.println("Soft assert success");
	sa.assertAll();
	}
@Parameters({"Para1","Para2"})
@Test(dependsOnMethods = {"tc1"}, groups = {"Regression"})
public void tc2(String P1, String P2) {
	System.out.println("test case 2" +P1 +P2);
	}
@Test(dependsOnMethods = {"tc1", "tc2"}, groups = {"Regression", "Smoke"})
public void tc3() {
	System.out.println("test case 3");
	}
@Test(dependsOnMethods = {"tc1", "tc2"}, groups = {"Regression", "Default"})
public void tc4() {
	System.out.println("test case 4");
	}
@Test(dependsOnMethods = {"tc1", "tc2"}, groups = {"Regression", "Default"}, enabled = true)
public void tc5() {
	System.out.println("test case 5");
	}
@BeforeTest
public void bef() {
	
	System.out.println("Guru Vignesh is king");
}

 @BeforeGroups(groups = {"Regression"})
 public void beforegroup() {
	 
	 System.out.println("before groups");
 }


}
