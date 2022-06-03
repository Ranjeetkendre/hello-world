package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		  Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rahul");
		 driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("xxxaa");
		 driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"reg_email__\"]")).sendKeys("3333333");
		 
		 driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		 driver.findElement(By.xpath("//option[contains(text(),'11') and @value=\"11\"]")).click();
		 
		 driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		 driver.findElement(By.xpath("//option[contains(text(),'Mar')]")).click();
		 
		 driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		 driver.findElement(By.xpath("//option[@value=\"2021\"]")).click();
		 driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
		 
		 		 	 
	}

}
