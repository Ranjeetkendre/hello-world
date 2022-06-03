package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  Thread.sleep(4000);
		 
		  driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rahul");
		  driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Sharma");
		  driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\" and @name=\"reg_email__\"]")).sendKeys("3333333");
		 
		   WebElement day= driver.findElement(By.id("day"));
		   WebElement month= driver.findElement(By.id("month"));
		   WebElement year= driver.findElement(By.id("year"));
		   
           String dob ="12/5/2016";  // testdata
           
           String [] date = dob.split("/");
              
           dropdown(day,date[0]);
           dropdown(month,date[1]);
           dropdown(year,date[2]);
         
	}
	
	 public static void  dropdown(WebElement element,String value) {
		
		Select select = new Select(element);
	
		//select.selectByVisibleText(value);
		select.selectByValue(value);
		
		
			
	}
}
