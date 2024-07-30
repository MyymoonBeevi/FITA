package co.edurekatraining;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParameterExample {
@Parameters({"validUsername","validPassword"})	
@Test
public void Login(String username, String password) {
	
	Reporter.log("Username is" +username);
	Reporter.log("Password is" +password);
	
}
@Parameters({"invalidUsername","invalidPassword"})	
@Test
public void invlidLogin(String username, String password) {
	
	Reporter.log("invalid Username is" +username);
	Reporter.log("invalid Password is" +password);
	Reporter.log(password);
	assertTrue(1 < 9);
	assertFalse(2>3);;
	
}

}
