package Windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
			
		    Set<String> WindowsID =	driver.getWindowHandles();
			
		   // FirsrMethod
		    Iterator<String> it = WindowsID.iterator();
		    
		    String ParentWindow = it.next();
		    String ChildWindow = it.next();
		    
		    System.out.println("Paren Window :"+ParentWindow);
		    System.out.println("Child Window :"+ ChildWindow);
		    
		    driver.switchTo().window(ParentWindow);
		    driver.switchTo().window(ChildWindow);

		    driver.switchTo().window(ParentWindow);
		    System.out.println("Parent Window Title :"+driver.getTitle());
		    
		    driver.switchTo().window(ChildWindow);
		    System.out.println("Child Window tile:"+driver.getTitle());
		    
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//a[@class=\"btn-orange contact-ohrm \"]")).click();
		    
		    driver.findElement(By.xpath("//input[@id=\"Form_submitForm_FullName\"]")).sendKeys("Rahul");
		    
		    driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("CG");
		    
	        driver.switchTo().window(ParentWindow);
	        
		    System.out.println(driver.getCurrentUrl());
		    
		    //Second Option
		    
		    for(String winid:WindowsID) {
		    	//System.out.println(winid);
		    String Title =	driver.switchTo().window(winid).getTitle();
		    System.out.println(Title);
		    	
		    }
		    //driver.close();
		    //driver.quit();

	}
}
