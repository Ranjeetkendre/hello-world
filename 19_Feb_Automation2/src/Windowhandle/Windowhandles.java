package Windowhandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
			
//			String WindowID = driver.getWindowHandle();
//			System.out.println(WindowID);
			//The Getwindowhandles method is used to stor all the opened windows id in the set data .
			
			Set<String> WindowID = driver.getWindowHandles();
					
			
			// First Mwthod - Iterator  
			
			Iterator <String> it =  WindowID.iterator();
			
			String ParentWindow = it.next(); // Which will give first window.
			String ChildWindow  = it.next();
			
			System.out.println("ParentWindow :"+ParentWindow);
			System.out.println("ChildWindow :"+ ChildWindow);
			
	     // Second mehtod  -- ArrayList/List
			   
			List<String> WindowIDList = new ArrayList(WindowID); // To converting set to list
			String Parenet = WindowIDList.get(0);
			String Child  =WindowIDList.get(1);
			
			System.out.println("ParentWindow :"+Parenet);
			System.out.println("ChildWindow :"+Child);
							
			
			
			
	}

}
