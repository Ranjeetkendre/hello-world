package Webdriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();   
		  
		  driver.get("https://www.google.com/");
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		  
		  System.out.println(driver.manage().window().getSize());
		  Thread.sleep(10000);
		  Dimension D=new Dimension(400,500);
		  Thread.sleep(10000);
		  driver.manage().window().setSize(D);
		  Thread.sleep(10000);
		  System.out.println(driver.manage().window().getSize());
		  Thread.sleep(10000);
		  driver.close();
		
		  

	}

}
