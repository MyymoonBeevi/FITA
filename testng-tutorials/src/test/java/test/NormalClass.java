package test;

import org.testng.annotations.Test;

public class NormalClass {

	@beforemethod
	
	public void befo() {
		
		System.out.println("from before");	
		
	}
	
	@aftermethod
	
public void aft() {
		
		System.out.println("from aft");	
		
	}
	
@Test
	
	public void tc1() {
		
	System.out.println("from tc 1");	
		
}
@Test
public void tc2() {
	
	System.out.println("from tc 2");	
	
}
	
	

}
