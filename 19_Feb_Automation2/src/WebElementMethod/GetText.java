package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();	  
		  //Xpath
		  driver.get("https://www.facebook.com/");
     	  String Text=  driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
     	  String excepetdresult ="Facebook helps you connect and share with the people in your life.";
     	  Thread.sleep(4000);
          System.out.println(Text.equals(excepetdresult));
          String S =  driver.findElement(By.xpath("//div[@id=\"reg_pages_msg\"]")).getText() ;
          String s1= "for a celebrity, brand or business.";
          System.out.println(S.equals(s1));
          driver.close();
	}

}
