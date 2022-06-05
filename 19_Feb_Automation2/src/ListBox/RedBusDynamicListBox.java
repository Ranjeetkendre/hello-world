package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDynamicListBox {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();		  
		  driver.get("https://www.redbus.in/");
		  Thread.sleep(4000);
		  driver.findElement(By.id("src")).sendKeys("Pune");
		  Thread.sleep(5000);
		  
		  List<WebElement> Cityfrom=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		  System.out.println("Total count : "+Cityfrom.size());
		  Thread.sleep(3000);
		  for(int i=0; i<Cityfrom.size();i++) {
			  
	    	  System.out.println(Cityfrom.get(i).getText());
	    	  if(Cityfrom.get(i).getText().equals("Warje, Pune")) {
	    		  Cityfrom.get(i).click();
	    		  break;	    		  
	    	  }
	      }		  
		  System.out.println();
		 	driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
		 	Thread.sleep(3000);
		  List<WebElement> DestCity=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		  System.out.println("Total count : "+DestCity.size());
		  
		  for(int i=0; i<DestCity.size();i++) {
	    	  System.out.println(DestCity.get(i).getText());
	    	  if(DestCity.get(i).getText().equals("Bandra East, Mumbai")) {
	    		  DestCity.get(i).click();	  
	    		  break;
	    	  }	    	
		  }
	}
}
