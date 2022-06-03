package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotusingmethod {
	
	 static WebDriver driver;
	 public static void main(String[] args) throws IOException, InterruptedException {
  
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			takescreenshot("19FebEvening");
			
			Thread.sleep(3000);
			
			driver.close();
			
	}	
	  public static void takescreenshot(String filename) throws IOException {
		//1. TO take screenshot and store  it as a file format: 
		  
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make();
		   
		//Now copy the the screenshot to desired  location using copy method
	    File destination=new File("C:\\Users\\RKENDRE\\Desktop\\Screenshot\\"+filename+""+random+".jpg");
		
		//Copy screenshot to destination folder
		 FileHandler.copy(Source, destination);
	}

}
