package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTiltle {

	public static void main(String[] args) throws InterruptedException {
		String ExpectedResult = "Google";
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		String Title=driver.getTitle();
		
		System.out.println(Title);
		if(Title.equals(ExpectedResult)) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Wrong Title");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
