package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Listoptionwithoutselectclass2 {

	 static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		   driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(4000);
		 
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		   
		    String Day_Xpath= "//Select[@id=\"day\"]//option";
		    String Month_Xpath = "//Select[@id=\"month\"]//option";
		    String year_Xpath  ="//Select[@id=\"year\"]//option";
		    
		  	
		    String dob ="15-May-2020";
		    String []date =dob.split("-");
		    
		    slectdropdown(Day_Xpath,  date[0]);
		    slectdropdown(Month_Xpath,date[1]);
		    slectdropdown(year_Xpath, date[2]);
	          
	 }
	 
	public static void  slectdropdown(String xpath, String value) throws InterruptedException {
		 		  		  
		     List<WebElement> Select1 = driver.findElements(By.xpath(xpath));
		     System.out.println(Select1.size());
		     
		     for(int i=0;i<Select1.size();i++) {
				  System.out.println(Select1.get(i).getText());
				  
				    if(Select1.get(i).getText().equals(value)) {
				    	
				    	Select1.get(i).click();		    
				    }
		     }
	}
 }