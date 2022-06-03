package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
	    WebElement Text =driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));

	    js.executeScript("arguments[0].scrollIntoView();", Text);
				
		//How manay row are there
		
	    int Row =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		System.out.println(Row);		
		//How manay columns in the table
		
		int column =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println(column);
		
		for(int i=2;i<=Row;i++) {
			
			for(int j=1;j<=column;j++) {
				
				String actualvalue = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
			   if(actualvalue.equals("Canada")) {
				   System.out.println("Row :"+i+" : "+"Col :"+j);
				   break;
			   }
			}
		}
		
		
	}

}
