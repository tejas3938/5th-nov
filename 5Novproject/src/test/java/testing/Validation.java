package testing;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import education.Login;
import education.Logout;
import education.Profile;
import education.Progress;
import education.Teachers;
import education.teachersinside;
import utils.Utility;

public class Validation {
	int testID;
	WebDriver driver;
	Login login;
	Teachers teacher;
	Logout logout;
	Profile profile;
	Progress progress;
	
	@BeforeTest
	public void openbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.khanacademy.org/");
		driver.manage().window().maximize();
	}
	
		@BeforeClass
		public void beforeclass()
		{
			teacher = new Teachers(driver);
			profile = new Profile(driver);
			progress = new Progress(driver);
		}
		
		@BeforeMethod
		public void beforemethod() throws EncryptedDocumentException, IOException
		{	
			login = new Login(driver);
			login.loginlink();
			login.username();
			login.password();
			login.loginbutton();
		}
//		@Test
//		public void teachersinsidepage()
//		{
//			teachersinside teacher1 = new teachersinside(driver);
//			teacher1.classcode();
//		}
		@Test
		public void Teacher()
		{
			testID=1;
			teacher = new Teachers(driver);
			teacher.teachers();
		}
		@Test
		public void Profilepage()
		{
			testID=2;
			profile = new Profile(driver);
			profile.profile();
		}
		@Test
		public void Progresspage()
		{
			testID=3;
			progress = new Progress(driver);
			progress.progress();
		}
		
		@AfterMethod
		public void afterMethod(ITestResult result) throws IOException 
		{
			if(ITestResult.FAILURE == result.getStatus() ) 
			{
				Utility.capturescreenshot(driver, testID);
			}
			logout.name();
			logout.logout();
		}
		
		@AfterClass
		public void afterClass()
		{
			driver.quit();
		}
	}
