package Page_Object_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException {
	
		 ChromeOptions option =new ChromeOptions();
		 option.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver(option); 
		  
		  driver.manage().window().maximize();  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get("https://kite.zerodha.com/");
		  
		  Thread.sleep(3000);
		  Kite_Login_Page1 LP1 =new Kite_Login_Page1(driver);
		  LP1.UserID();
		  LP1.Pass();
		  LP1.LoginBton();
		  
		  Kite_login_page2 Lp2 =new Kite_login_page2(driver);
		  Lp2.Pinpage();
		  Lp2.Continuebutton();
		  
		  Kite_Home_Page Lp3 =new Kite_Home_Page(driver);
		  Lp3.UserID();
		  
	}

}
