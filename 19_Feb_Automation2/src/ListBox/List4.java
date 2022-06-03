package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List4 {
        static WebDriver driver; 
	 public static void main(String []args) throws InterruptedException {
			
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[starts-with(@id,\"u_0_2_\")]")).click();
			Thread.sleep(2000);
			String Dayxpath = "//Select[@id=\"day\"]//option";
			String monthxpath = "//Select[@id=\"month\"]//option";
			String yearxpath = "//Select[@id=\"year\"]//option";
			
			String dob="17-10-2002";
			
			
			selectdropdown(Dayxpath,"17");
			selectdropdown(monthxpath,"May");
			selectdropdown(yearxpath,"2020");
			
//			String dob="17-10-2002";
//			String date[]=dob.split("-");
//			
//			selectdropdown(Dayxpath,date[0]);
//			selectdropdown(monthxpath,date[1]);
//			selectdropdown(yearxpath,date[2]);
}
 
	public static void selectdropdown(String xpath,String value) {
		 
		 List<WebElement>s1=driver.findElements(By.xpath(xpath));
		 
		 System.out.println(s1.size());
		 
		 for(int i=0;i<s1.size();i++) {
			 
			 System.out.println(s1.get(i).getText());
			 
			 if(s1.get(i).getText().equals(value)) {
				 s1.get(i).click();
			 }
			 
		 }		 
	 }	 
		 			 
	 }