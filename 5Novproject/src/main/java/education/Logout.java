package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//button[@class='_1s7gp2bm']") private WebElement name;
	@FindBy(xpath="//a[@class='_71vn8x8']") private WebElement logout;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void name()
	{
		name.click();
	}
	public void logout()
	{
		logout.click();
	}
}
