package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot4 {

	public static void main(String[] args) throws InterruptedException, IOException {
	
       System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				    
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		  WebElement Src = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		  //Take screnshot & copy it into object
		
		  File Source= ((TakesScreenshot) Src).getScreenshotAs(OutputType.FILE);
		   
		  System.out.println(Source);
		  Thread.sleep(2000);
		  
		  String random=RandomString.make(3);
		  
		  String  filename = "Facebook";
		  
		  File Destination =new File(".\\Screenshot\\"+filename+""+random+".jpg");
		  
		  FileHandler.copy(Source, Destination);
		  
		
	}

}
