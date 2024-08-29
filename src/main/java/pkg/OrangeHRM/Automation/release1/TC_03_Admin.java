package pkg.OrangeHRM.Automation.release1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHrm_Reporter_Library.Reporter;

public class TC_03_Admin  extends Reporter{
	
	@BeforeTest
	public void Setdata() {
		testCaseName ="TC_03_Admin_Creation";
		testCaseDescription ="To verify the Admin Tab Should Create the EMployee name";
		author ="QA Team";
		category ="Smoke Test";
	}

	@Test
	public void Admin_creation() {

		// Driver Initialization
		ChromeDriver driver = new ChromeDriver();
		// Loading the URL
		String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		// Loading the User name & Password
		String un = "Admin";
		String pw = "admin123";
		// Initializing Implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Launching URL
		driver.get(baseURL);
		// Maximizing window
		driver.manage().window().maximize();
		// Entering User name
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		// Entering Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
		// Clicking the submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Click on the Admin Tab 
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		//Clicking the Add button
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		//Selectcing the Userrole
		driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
		//Selecting the Admin as Userrole
		driver.findElement(By.xpath("(//span[text()='Admin'])[2]")).click();
		//Selecting the Employee name 
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("vija");
		//Selecting the EMployee name
		driver.findElement(By.xpath("//span[text()='Vijayakumar  s']")).click();
		//Selecting the Status of the Employee
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]")).click();
		//Selecting the Employee Status as Enabled
		driver.findElement(By.xpath("//span[text()='Enabled']")).click();
		//Enering the Username
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Vijay");
		//Entering the Password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Vijay@1");
		//Entering the Confirm password
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Vijay@1");
		//Clicking the save button
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}

}
