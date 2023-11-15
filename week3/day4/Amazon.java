package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			//search field
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<String> sortedvalue = new ArrayList<String>();
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			System.out.println(webElement.getText());		
			String text = webElement.getText();
	
		sortedvalue.add(text);
		}
		Collections.sort(sortedvalue);
		System.out.println(sortedvalue);
}
}