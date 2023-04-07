package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {

	@FindBy(xpath="(//a[@class='_8ry3ze'])[2]") private WebElement profile;
		
	public Profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void profile()
	{
		profile.click();
	}	
}