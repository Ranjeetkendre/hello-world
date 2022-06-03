package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(4000);
		 
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  
		   WebElement day= driver.findElement(By.id("day"));
		   WebElement month= driver.findElement(By.id("month"));
		   WebElement year= driver.findElement(By.id("year"));
		   
		   Select selectday = new Select(day);
		   // Q- How will get totla no of size
		   
		   List<WebElement>Listday = selectday.getOptions();
	
		   
		   System.out.println(Listday.size());
		   
		   //Q -2  How will u print all the values
		   System.out.println();
		   
		   for(int i=0;i<Listday.size();i++) {
			   
			  String dayvalues =Listday.get(i).getText();
			  System.out.println(dayvalues);
			  
			//Q- How will u sleect specific values from DD with help of get method
			  
			  if(dayvalues.equals("20")) {
				  Listday.get(i).click();
			  }					 
		   }
		   		   
		   System.out.println("-----------------------------------------------------");
		   Select selectmonth = new Select(month);
		   List<WebElement>Listmonth = selectmonth.getOptions();
		   System.out.println(Listmonth.size());
	
		   for(int i=0;i<Listmonth.size();i++) {
			   
				  String monthvalues =Listmonth.get(i).getText();
				  
				  System.out.println(monthvalues);
	}
	}
}
