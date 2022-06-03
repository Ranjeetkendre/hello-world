package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleiframe2 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("http://demo.automationtesting.in/Frames.html");
				
				Thread.sleep(4000);
				
				driver.switchTo().frame("singleframe");
				
				driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
				
				

	}

}
