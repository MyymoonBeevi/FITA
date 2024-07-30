package edureka;

import org.openqa.selenium.By;

public class locators extends browser{
	
	public void locatorDemo() {
		//id
//		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("from name attr");
		
		//className
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("from class");//error
//		driver.findElement(By.className("inputtext")).sendKeys("from class-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from class-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from class-3");
		
		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//link text ==> hyperlinks ==> tagname ==> 'a'
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial link text
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("rd?")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("ssw")).click();
//		driver.findElement(By.partialLinkText("ten pas")).click();
//		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.partialLinkText("?")).click();
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute path
//		String absPath = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(absPath)).sendKeys("from abs path");
		
		//relative path
//		driver.findElement(By.xpath("//form/div[1]/div[1]/input")).sendKeys("from relative path");
//		driver.findElement(By.xpath("//form//input[@id='email']")).sendKeys("from relative path");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from relative path");
		
		//tagname
//		driver.findElement(By.xpath("//button")).click();
		
		//attribute ==> recommend it
//		driver.findElement(By.xpath("//*[@id='email']")
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sample");
		
		//tagname + attribute
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		driver.findElement(By.xpath("//input[@type='text']"));
		driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
				driver.findElement(By.xpath("//input[@autofocus='1']"));
		//functions
		//starts-with
		driver.findElement(By.xpath("//input[starts-with(@id, 'email')]"));
		driver.findElement(By.xpath("//input[starts-with(@id, 'emai')]"));
		driver.findElement(By.xpath("//input[starts-with(@id, 'ema')]"));
	    driver.findElement(By.xpath("//input[starts-with(@id, 'em')]"));
		driver.findElement(By.xpath("//input[starts-with(@id, 'e')]"));
		
		//contains
		driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'emai')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'ema')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'em')]"));
		driver.findElement(By.xpath	("//input[contains(@id, 'e')]"));
		
		driver.findElement(By.xpath("//input[contains(@id, 'mail')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'ail')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'ail')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'il')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'l')]"));
		
				driver.findElement(By.xpath("//input[contains(@id, 'mai')]"));
						driver.findElement(By.xpath("//input[contains(@id, 'ai')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'ma')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'i')]"));
		driver.findElement(By.xpath("//input[contains(@id, 'm')]"));

		//text()
		driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		driver.findElement(By.xpath("//button[text()='Log in']"));
		
		//starts-with + text()
		driver.findElement(By.xpath("//button[starts-with(text(), 'Log in')]"));
		driver.findElement(By.xpath("//button[starts-with(text(), 'Log i')]"));
		driver.findElement(By.xpath("//button[starts-with(text(), 'Log ')]"));
		driver.findElement(By.xpath("//button[starts-with(text(), 'Log')]"));
		driver.findElement(By.xpath("//button[starts-with(text(), 'Lo')]"));
		driver.findElement(By.xpath("//button[starts-with(text(), 'L')]"));
		
		//contains + text()
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Log i')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Log ')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Log')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Lo')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'L')]"));
		
		driver.findElement(By.xpath("//button[contains(text(), 'og in')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'g in')]"));
		driver.findElement(By.xpath("//button[contains(text(), ' in')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'in')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'n')]"));
		
		driver.findElement(By.xpath("//button[contains(text(), 'og i')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'g i')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'og ')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'g i')]"));
		
		
		//Advanced xpath functions
		//and
		driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
		
		//or
		driver.findElement(By.xpath("//input[@id='email' or @name='email']"));
		driver.findElement(By.xpath("//button[text()='Log in' or text()='लॉग इन करें']"));
		
		//index ==> avoid this as much as possible
		//when elements are not under the same parent ==> index is defined outside the exp, it starts from 0
		//driver.findElement(By.xpath("//input")[2]);
				
		//when elements are under the same parent ==> index is inside the exp and it strats from 1
		driver.findElement(By.xpath("//select[2]"));//month drop down
		driver.findElement(By.xpath("//span/select[2]"));
		
		//chained
		driver.findElement(By.xpath("//span[@class='_5k_4']/span/select[@id='month']"));
		driver.findElement(By.xpath("//span[@class='_5k_4']//select[@id='month']"));
		//("//span[contains(@class,'_5k_4')]//select[@id='month']");
		
		
		
		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css");
	}

	public static void main(String[] args) {
		locators obj = new locators();
		obj.setupBrowser("chrome", "https://www.facebook.com/");
		obj.locatorDemo();

	}

}
