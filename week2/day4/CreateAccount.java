package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps/.");
		   
		   //maximize window
		   driver.manage().window().maximize();
		   
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   //login
		   driver.findElement(By.id("username")).sendKeys("DemoCSR");
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   driver.findElement(By.className("decorativeSubmit")).click();
		   
		   //click the CRMSFA
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   
		   //create lead
		   driver.findElement(By.linkText("Leads")).click();
		   driver.findElement(By.linkText("Create Lead")).click();
		   
		   //company name
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test");
		   Thread.sleep(2000);
		   
		   //first name
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("balaji");
		   
		   //Last name
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sridhar");
		   
		   //select computer software
		   WebElement findElement = driver.findElement(By.name("industryEnumId"));
		   Select industry = new Select(findElement);
		   industry.selectByIndex(2);
		   
		   //select s-corporation
		   WebElement findElement2 = driver.findElement(By.name("ownershipEnumId"));
		   Select ownership = new Select(findElement2);
		   ownership.selectByVisibleText("S-Corporation");
		   
		   //select source
		   WebElement findElement3 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		   Select source = new Select(findElement3);
		   source.selectByValue("LEAD_EMPLOYEE");
		   
		   //select e-commerce 
		   WebElement findElement4 = driver.findElement(By.name("marketingCampaignId"));
		   Select select2 = new Select(findElement4);
		   select2.selectByIndex(5);
		   
		   //select Texas
		   WebElement findElement5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		   Select state = new Select(findElement5);
		   state.selectByValue("TX");
		   
		   //click create lead
		   driver.findElement(By.name("submitButton")).click();
		   
		   //get title
		   String title = driver.getTitle();
		   System.out.println(title);
		   
		   //verify title
		   if(title.contains("lead")) {
			   System.out.println("The lead is created");
		   } else {
				   System.out.println("The lead is not created");
			   }
		   
		  //close the browser 
		   driver.close();
	}

}
