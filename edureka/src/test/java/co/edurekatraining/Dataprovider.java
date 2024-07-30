package co.edurekatraining;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "dp")
  public void loginValidation(String id, String pwd) {

  Reporter.log("id is "+id);
  Reporter.log("pwd is "+pwd);
  
  
  }

  @DataProvider
  public String[][] dp() {
    return new String[][] {
      new String[] { "guru@fmail.com", "12345" },
      new String[] { "ravi@fb.com", "jaksks" },
    };
  }
}
