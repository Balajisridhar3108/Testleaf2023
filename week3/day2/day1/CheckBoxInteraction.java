package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='java']")).click();
		//verify title
		String title = driver.getTitle();
		if(title.contains("checked")) {
			System.out.println("succesfull");
		}
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]")).click();
	}

}
