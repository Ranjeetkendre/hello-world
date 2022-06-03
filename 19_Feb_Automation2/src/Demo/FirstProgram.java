package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		//System-- Class name
		//Setproperty-- Methodname
		//Webdriver - Verion name of selenium
		//chrome - Name of browser
		//driver - brower	
		//Values =- Pathe of chromedriver.exe
		
	     ChromeDriver driver =new ChromeDriver();
//		 WebDriver driver = new ChromeDriver();   
//       System.out.println("Hello good evening");
          
          
          
         
	}

}
