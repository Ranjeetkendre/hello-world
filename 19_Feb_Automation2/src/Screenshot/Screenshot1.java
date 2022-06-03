package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//full page screenshot
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		//Take Screenshot & copy it into object 
		
		File source= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
        System.out.println(source);		
		File destination = new File("C:\\Users\\RKENDRE\\Desktop\\Screenshot\\Sasmp.png");
		
		FileHandler.copy(source, destination);
		
		
	}

}
