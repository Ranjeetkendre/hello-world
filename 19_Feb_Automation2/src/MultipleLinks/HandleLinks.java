package MultipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click on links
		Thread.sleep(2000);
	   //driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		
		
		//How many links arepresent on the webpage
		
	List <WebElement>links=	driver.findElements(By.tagName("a"));	
	System.out.println("Numbers of links present on webpage :"+links.size() );
	
	//3. Print all the links 
	
//	for(int i=0;i<links.size();i++) {
//		System.out.println(links.get(i).getAttribute("href"));
//	}
	
    	for(WebElement link:links) {
		System.out.println(link.getText());
		System.out.println(link.getAttribute("href"));
	}
	
	}

}
