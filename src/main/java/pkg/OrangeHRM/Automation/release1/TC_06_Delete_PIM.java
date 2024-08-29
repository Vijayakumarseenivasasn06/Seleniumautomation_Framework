package pkg.OrangeHRM.Automation.release1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangeHrm_Reporter_Library.Reporter;

public class TC_06_Delete_PIM extends Reporter{

	@Test
	public void Delete() {

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

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("vij");

		driver.findElement(By.xpath("//span[text()='Vijayakumar  s']")).click();

		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-table-card-cell-checkbox']")).click();
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		
		driver.close();
		
	}

}
