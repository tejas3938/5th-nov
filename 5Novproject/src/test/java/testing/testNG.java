package testing;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.SocketException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import education.Login;
import education.Logout;
import education.Teachers;

public class testNG {
WebDriver driver;
Login login;
Teachers teacher;
Logout logout;

	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException
	{
		login = new Login(driver);
		
		login.loginlink();
		login.username();
		login.password();
		login.loginbutton();
	}
	
	@Test
	public void Teacherpage()
	{
		teacher = new Teachers(driver);
		
		teacher.teachers();
		//String url = driver.getCurrentUrl();
		//String result = "https://www.khanacademy.org/profile/me/teachers";
		//Assert.assertEquals(url,result);
		//SoftAssert soft= new SoftAssert();
		//soft.assertEquals(url, result);
		//Assert.assertTrue(true);
		//soft.assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		logout = new Logout(driver);
		logout.name();
		logout.logout();
		//Assert.fail();
		//soft.assertAll();
	}
	
	@AfterClass
	public void afterClass() throws SocketException
	{
		driver.quit();
	}
}
