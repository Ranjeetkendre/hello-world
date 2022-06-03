package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	

		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver(); 
		 
		 driver.manage().window().maximize();		 	  
	  
		  Thread.sleep(4000);
		  
			driver.get("https://kite.zerodha.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			 FileInputStream file= new FileInputStream(".//19feb//TestData.xlsx");
				
			 Sheet data	= WorkbookFactory.create(file).getSheet("Sheet1");
			   
			 String UserID = data.getRow(0).getCell(0).getStringCellValue();
			   
			 driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(UserID);
			   
			  String Password = data.getRow(0).getCell(1).getStringCellValue();
			  
			  driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(Password);
			  
			  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			  
			  Thread.sleep(3000);
						 
			  String PIN = data.getRow(0).getCell(2).getStringCellValue();
			  
			  driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
			  
			  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			  
//			  driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(data.getRow(0).
//					  getCell(2).getStringCellValue());
	}

}
