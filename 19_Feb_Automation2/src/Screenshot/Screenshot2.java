package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//Take screnshot & copy it into object
		
		File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   
		  Thread.sleep(2000);
		  
		  String random=RandomString.make(10);
		  
		  int  filename = 10;
		  
		  File Destination =new File("C:\\Users\\RKENDRE\\Desktop\\Screenshot\\"+filename+""+random+".jpg");
		  FileHandler.copy(Source, Destination);
		  
		
	}

}
