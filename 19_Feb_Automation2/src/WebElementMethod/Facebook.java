package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Xpath
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected();
		  
		  if( driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected()==true) {
			  driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).click();
		  }
		  
		  System.out.println(driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected());
		  
		  if( driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected()==false) {
			  driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).click();
		  }
	}

}
