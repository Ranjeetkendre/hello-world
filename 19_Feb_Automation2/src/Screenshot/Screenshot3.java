package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		  //Take screnshot & copy it into object
		
		   File Source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		   
		  Thread.sleep(2000);
		  
		  String random=RandomString.make();
		  
		  String  filename = "Redbus";
		  
		  File Destination =new File(".\\19feb\\"+filename+""+random+".jpg");
		  
		  FileHandler.copy(Source, Destination);
		
	}

}
