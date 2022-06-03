package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webDriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(4000);
		
		System.out.println(driver.manage().window().getSize());		
	
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		driver.quit();
		
		
        
	}

}
