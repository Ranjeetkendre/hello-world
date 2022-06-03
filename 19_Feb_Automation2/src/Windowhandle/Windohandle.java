package Windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windohandle {

	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			String WindowID = driver.getWindowHandle();
   // The getwindowhandle method is used to store the single window browser id 		
			System.out.println(WindowID); //CDwindow-7E6CB4AAECBCEB5A4588D301AE454906
			
			driver.close();               //CDwindow-362069E25919AD9D1BD5F17267316348
			
                                          //CDwindow-7A4D2B8DFBFCF394F376E9C5FCDA3EBA
	}

}
