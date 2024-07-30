package edureka;

public class NavCommands extends browser {
	
	public void navCommandsDemo() throws InterruptedException {
		
		//Thread.sleep is used for demo purpose only
		
		System.out.println("Navigating to youtube page");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		
		//back
		System.out.println("Navigating back to google page");
		Thread.sleep(5000);
		driver.navigate().back();
		
		//forward
		System.out.println("Navigating forward to youtube page");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		//refresh
		System.out.println("Refreshing youtube page page");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	
	public static void main(String[] args) {
		NavCommands obj = new NavCommands();
		obj.setupBrowser("chrome", "https://www.google.com");
		try {
			obj.navCommandsDemo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
