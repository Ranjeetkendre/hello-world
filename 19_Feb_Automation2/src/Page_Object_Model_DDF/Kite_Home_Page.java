package Page_Object_Model_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page {

	
	public Kite_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class=\"user-id\"]")
	private WebElement UserID1;
	
	public void UserID() {
		String ExceptedUserID ="GP8097";
		String ActualTextID =UserID1.getText();
		
		if(ExceptedUserID.equals(ActualTextID)) {
			System.out.println("Valid UserID");
		}
		else
			System.out.println("Invalid user ID");
	}
}
