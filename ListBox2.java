package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   Thread.sleep(4000);
		 
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  
		   WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
		   WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
		   WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
		   
		 //1.Select element using selectByVisibleText
		   Select select=new Select(day);
		   select.selectByVisibleText("15");
		   
		   Select select1=new Select(month);
		   select1.selectByVisibleText("May");
		   
		   Select select2=new Select(year);
		   select2.selectByVisibleText("2020");
//		   
//		 2.Select element using selectByIndex
//		   Select select4=new Select(day);
//		   select4.selectByIndex(15);
//	   
//		   Select select5=new Select(month);
//		   select5.selectByIndex(5);
//	   
//		   Select select6=new Select(year);
//		   select6.selectByIndex(55);
//		 
//		   3.Select element using selectByValue
//		   Select select7=new Select(day);
//		   select7.selectByValue("15");
//		   
//		   Select select8=new Select(month);
//		   select8.selectByValue("5");
//		   
//		   Select select9=new Select(year);
//		   select9.selectByValue("1995");
		   
		   
	}

}
