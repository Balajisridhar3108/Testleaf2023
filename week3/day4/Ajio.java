package week3.day4;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search field 
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
	
		//click fashion bags
		driver.findElement(By.xpath("//input[@name='l1l3nestedcategory']/following::label[2]")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//print result
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		
		//get brand list
		 List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='brand']"));
		 
		 for (int i = 0; i <findElements.size(); i++) {
			 WebElement webElement = findElements.get(i);
			 //System.out.println(webElement);
			 String replaceAll = webElement.getText();
			 System.out.println(replaceAll);
		}
		 System.out.println("=======================================");
		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (int i = 0; i < findElements2.size(); i++) {
			WebElement webElement = findElements2.get(i);
			String text2 = webElement.getText();
			System.out.println(text2);
			
		} 
			
		driver.close();

	

	}
	}
