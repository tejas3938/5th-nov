package testing;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import education.Login;
import education.Profile;
import education.Progress;
import education.Teachers;

public class TestLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.khanacademy.org/");
	
	driver.manage().window().maximize();
	
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,250)", "");
	
	Login login = new Login(driver);
	
	login.loginlink();
	login.username();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
	login.password();
	login.loginbutton();
	
	Teachers teachers = new Teachers(driver);
	
	teachers.teachers();
	teachers.classcode();
	teachers.classcodetext();
	teachers.cont();
	teachers.back();
	
	Profile profile = new Profile(driver);
	
	profile.profile();
	
	Progress progress = new Progress(driver);
	
	progress.progress();
	
	
}
}