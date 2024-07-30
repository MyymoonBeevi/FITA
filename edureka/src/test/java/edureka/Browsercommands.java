package edureka;

public class Browsercommands extends browser{
	
	public void browserCommandsDemo() {
		//get ==> open the url
//		driver.get("https://www.youtube.com");
		
		//get current url
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
		//layman's way of writing the test case
//		String expectedUrl = "https://www.facebook.com/";
//		String actualUrl = driver.getCurrentUrl();
//		if(actualUrl.equals(expectedUrl))
//			System.out.println("url test case - passed");
//		else
//			System.out.println("url test case - failed");
		
		//get title
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
		
		
		//get page source
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		//Thread.sleep is used for demo purpose only
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close the tab
//		driver.close();
		
		//quit the browser
		driver.quit();
	}
	

	public static void main(String[] args) {
		Browsercommands obj = new Browsercommands();
		obj.setupBrowser("chrome", "https://www.fb.com");
		obj.browserCommandsDemo();
	}

}
