package Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Dimension D=new Dimension(500,800);
		Thread.sleep(10000);
	    driver.manage().window().setSize(D);
		Thread.sleep(10000);
		System.out.println(driver.manage().window().getSize());
	
		Point p=new Point(300,400);
		Thread.sleep(7000);
		driver.manage().window().setPosition(p);
		Thread.sleep(7000);
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(7000);
        driver.quit();
	}

}
