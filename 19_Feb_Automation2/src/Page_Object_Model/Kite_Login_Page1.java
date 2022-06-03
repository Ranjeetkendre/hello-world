package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page1 {

	public Kite_Login_Page1(WebDriver driver1) {// Constructor
		
		//PageFactory.initElements(driver1, this);
		PageFactory.initElements(driver1, this);
		
	}
	
      @FindBy(id="userid")	
      WebElement Username;
      
      @FindBy(xpath="//input[@id=\"password\"]")
      WebElement Password;
      
      @FindBy(xpath="//button[@type=\"submit\"]") 
      WebElement LoginButton;
      
      public void UserID() {
    	  Username.sendKeys("GP8097");
      }
    
      public void Pass() {
    	  Password.sendKeys("Swami@0110");
      }
      public void LoginBton() {
    	  LoginButton.click();
      }
      
}
