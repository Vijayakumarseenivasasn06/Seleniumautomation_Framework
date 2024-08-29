package pkg.OrangeHRM.Automation.release1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHrm_Reporter_Library.Reporter;

public class TC_01_Login extends Reporter {
	
	@BeforeTest
	public void setData() {
		testCaseName ="TC_01_Login";
		testCaseDescription ="To verify the Login functionality";
		author ="Vijayakumar S";
		category ="Smoke Test";
		
	}
	

	@Test
	public void Logindetails() {
		
		
		//Driver Initialization
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
		String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//Loading the User name & Password
		String un = "Admin";
		String pw = "admin123";
		//Initializing Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Launching URL
		driver.get(baseURL);
		//Maximizing window
		driver.manage().window().maximize();
		//Entering User name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		//Entering Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
		//Clicking the submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.close();
		
		
	}
	
}
