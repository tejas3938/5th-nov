package education;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Login {

	// step 1 To declare DM (Variable) globally
	@FindBy(xpath="//a[@id='login-or-signup']") private WebElement loginlink;//variable
	//@FindBy=annotation
	@FindBy(xpath="(//input[@class='_1azps1NaN'])[1]") private WebElement username;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginbutton;
	// Step 2 Initialization of Variable or DM
	public Login(WebDriver driver)
	//constructor // parameters
	{
		PageFactory.initElements(driver, this);
		//class		//method
	}
	// step 3 Method create
	public void loginlink()
	{
		loginlink.click();
	}
	public void username() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("G:\\Testngparameterisation.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		username.sendKeys(data);
	}
	public void password() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("G:\\Testngparameterisation.xlsx");
		String data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		password.sendKeys(data1);
	}
	public void loginbutton()
	{
		loginbutton.click();
	}
}