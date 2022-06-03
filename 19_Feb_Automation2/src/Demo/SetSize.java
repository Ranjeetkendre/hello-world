package Demo;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com");	
		// Create object of Dimension class
		Dimension D = new Dimension(500,768);
		// Setting the current window to that dimesnion
		driver.manage().window().setSize(D);
		Thread.sleep(10000);
		//Fetcing the current window size with getSize():
	    System.out.println(driver.manage().window().getSize());	
	
		Thread.sleep(10000);
		driver.close();
		
		

	}

}
