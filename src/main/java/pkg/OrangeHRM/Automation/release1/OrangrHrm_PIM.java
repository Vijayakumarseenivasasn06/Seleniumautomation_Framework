package pkg.OrangeHRM.Automation.release1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrangrHrm_PIM {

	@Test
	public void PIMtabsearch() {

		
		ChromeDriver driver = new ChromeDriver();
		String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String un = "Admin";
		String pw = "admin123";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		
		
		
		//Entering the Supervisorname
		 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("a");

		driver.findElement(By.xpath("//span[text()='Nivethaupdate Vinothupdate Baupdate']")).click();
		

		
		
	}
	
}
