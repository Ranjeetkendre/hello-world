package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
   
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
		
	    List<WebElement>Row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
	    System.out.println(Row1.size());
		
		//How manay columns in the table
		int column =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println(column);
		
		List<WebElement>Col1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println(Col1.size());
		
		//Retrive the specific row/column data
		
		String value =driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[7]/td[3]")).getText();
		
		System.out.println(value);
		
		// Retrive all the data from table
		
		for(int i=2;i<=Row;i++) { //Outer for loop
			
			for(int j=1;j<=column;j++) {
				
			String data=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+" | ";
			System.out.print(data);			
			}
			System.out.println();
		}
		driver.quit();
		
	}
}
	


