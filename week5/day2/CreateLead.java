package week5.day2;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead {
	public ChromeDriver driver;

	
	@Parameters({"url", "username" ,"password"})
	@BeforeMethod
	@Test
	public void createlead(String url, String username, String pwd) {
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(pwd);
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Create Lead")).click();
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		    driver.findElement(By.name("submitButton")).click();
		
}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	
}






