package co.edurekatraining;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExample {
@Parameters({"browser"})	
@Test
public void tc1(String browser) {
	Reporter.log("browser is "+browser);
	
}
}
