package edureka;

import java.util.ArrayList;

import java.util.*;

import org.openqa.selenium.By;

public class WindowManagementExample extends browser {

	
	public void WinDem() {
		
		//driver.getWindowHandle();
		//driver.getWindowHandles();
		//driver.switchTo().window("");
		
		
		//driver.close();
		//driver.quit();
		
		
		
		System.out.println("page title ==  "  +driver.getTitle());
		System.out.println("window id  ="  +driver.getWindowHandle());
		System.out.println("no win open == " +driver.getWindowHandles());
		
		System.out.println("\n*********************************\n");
		
		driver.findElement(By.partialLinkText("Instagram")).click();
		
		System.out.println("page title ==  "  +driver.getTitle());
		System.out.println("window id  ="  +driver.getWindowHandle());
		System.out.println("no win open == " +driver.getWindowHandles());
		
		System.out.println("\n*********************************\n");
		System.out.println("shifting control to pages");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("page title ==  "  +driver.getTitle());
		System.out.println("window id  ="  +driver.getWindowHandle());
		System.out.println("no win open == " +driver.getWindowHandles());
		
	}
	
	
	public void WinMgmt() {
		
		
		driver.findElement(By.linkText("Instagram")).click();
		String currhandle = driver.getWindowHandle();
		
		Set<String> multiple = driver.getWindowHandles(); 
		
		
		Iterator<String> itr = multiple.iterator();
		String MainWindowId = itr.next();
		System.out.println("Main window id is  " +MainWindowId);
		String ChildWindowId = itr.next();
		System.out.println("Main window id is  " +ChildWindowId);
		driver.switchTo().window(ChildWindowId);
		System.out.println("The child id is " +driver.getTitle());
		driver.switchTo().window(MainWindowId);
		System.out.println("The main id is " +driver.getTitle());
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
    
		WindowManagementExample obj1 = new WindowManagementExample();
		obj1.setupBrowser("chrome", "https://www.facebook.com");
		//obj1.WinDem();
		obj1.WinMgmt();

	}

}
