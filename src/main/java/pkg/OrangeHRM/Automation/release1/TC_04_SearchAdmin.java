package pkg.OrangeHRM.Automation.release1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHrm_Reporter_Library.Reporter;

public class TC_04_SearchAdmin extends Reporter {
	
	@BeforeTest
	public void Setdata() {
		
		testCaseName ="TC_02_PIMCreation";
		testCaseDescription ="To verify the Employee Creation functionality in PIM tab";
		author ="QA Team";
		category ="Smoke Test";
		
	}

	@Test

	public void Searchadmin() {

		ChromeDriver driver = new ChromeDriver();
		String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String un = "Admin";
		String pw = "admin123";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(baseURL);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		//Entering the Username
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("vijay");
		//Selecting the userrole
		driver.findElement(By.xpath("//div[text()='-- Select --']")).click();
		driver.findElement(By.xpath("(//span[text()='Admin'])[2]")).click();
		//Selecting the Employe name
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("vij");
		driver.findElement(By.xpath("//span[text()='Vijayakumar  s']")).click();
		//Selecting the Status of Employee
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Enabled']")).click();

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();

		driver.close();

	}

}
