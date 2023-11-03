package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("https://en-gb.facebook.com/");
		   
		   //maximize window
		   driver.manage().window().maximize();
		   
		   //implicitly wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   //Click create Account
		   driver.findElement(By.linkText("Create new account")).click();
		   
		   //credentials
		   driver.findElement(By.name("firstname")).sendKeys("balaji");
		   driver.findElement(By.name("lastname")).sendKeys("s");
		   driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("fosennoicranei-5168@yopmail.com");
		   driver.findElement(By.id("password_step_input")).sendKeys("TestLeaf");
		   
		   //select date of birth
		   WebElement findElement = driver.findElement(By.id("day"));
		   Select day = new Select(findElement);
		   day.selectByValue("27");
		   
		   WebElement findElement2 = driver.findElement(By.id("month"));
		   Select month = new Select(findElement2);
		   month.selectByVisibleText("Jun");
		   
		   WebElement findElement3 = driver.findElement(By.id("year"));
		   Select year = new Select(findElement3);
		   year.selectByValue("1999");
		   
		   //select gender
		   driver.findElement(By.xpath("//label[text()='Male']")).click();
		   
		   //close
		   driver.close();
		   
		   
		   
	}

}
