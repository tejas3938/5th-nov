package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class teachersinside {

	@FindBy(xpath="//a[@class='_1rhl3qm4']") private WebElement classcode;
	
	public teachersinside(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void classcode()
	{
		classcode.click();
	}
	
}
