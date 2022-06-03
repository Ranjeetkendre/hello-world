package Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.manage().window().getSize());
		
		
		Thread.sleep(5000);
	
	}

}
