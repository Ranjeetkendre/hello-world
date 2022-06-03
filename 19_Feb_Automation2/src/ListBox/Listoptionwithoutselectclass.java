package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listoptionwithoutselectclass {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(4000);
		 
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  
   
		   List<WebElement> Daylist= driver.findElements(By.xpath("//select[@id=\"day\"]//option"));		  
		   System.out.println(Daylist.size());
		   
		  for(int i=0;i<Daylist.size();i++) {
			  System.out.println(Daylist.get(i).getText());
			    if(Daylist.get(i).getText().equals("15")) {
			    	Daylist.get(i).click();		    	
			 
			 }
		}			
		   List<WebElement> monthlist= driver.findElements(By.xpath("//select[@id=\"month\"]//option"));		  
		   System.out.println(monthlist.size());
		   for(int i=0;i<monthlist.size();i++) {
				  System.out.println(monthlist.get(i).getText());
				    if(monthlist.get(i).getText().equals("Jun")) {
				    	monthlist.get(i).click();		    
				    	
        	}
       }
		   List<WebElement> Yearlist= driver.findElements(By.xpath("//select[@id=\"year\"]//option"));		  
		   System.out.println(Yearlist.size());
		   for(int i=0;i<Yearlist.size();i++) {
				  System.out.println(Yearlist.get(i).getText());
				    if(Yearlist.get(i).getText().equals("1994")) {
				    	Yearlist.get(i).click();		    
	     }
      }
	}
 }
