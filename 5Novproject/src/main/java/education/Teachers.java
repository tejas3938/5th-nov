package education;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {

	@FindBy(xpath="(//a[@class='_8ry3ze'])[3]") private WebElement teachers;
	@FindBy(xpath="//a[@class='_1rhl3qm4']") private WebElement classcode;
	@FindBy(xpath="//input[@class='_q92ef6']") private WebElement classcodetext;
	@FindBy(xpath="//button[@class='_1f0fvyce']") private WebElement cont;
	@FindBy(xpath="//a[@class='_1mwdd64y']") private WebElement back;
	
	public Teachers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void teachers()
	{
		teachers.click();
	}
	public void classcode()
	{
		classcode.click();
	}
	public void classcodetext()
	{
		classcodetext.sendKeys("Tejas618");
	}
	public void cont()
	{
		cont.click();
	}
	public void back()
	{
		back.click();
	}
	
}