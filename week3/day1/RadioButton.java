package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
	driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
	boolean selected = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).isSelected();
	System.out.println(selected);
	 if(selected==false) {
		 System.out.println("Hence verified");
	 }
	 else {
		 System.out.println("operation failed");
	 }
	boolean selected2 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
	System.out.println(selected2);
	 if(selected2==false) {
		 System.out.println("Hence verified");
	 }
	 else {
		 System.out.println("operation failed");
	
	 }
	 boolean selected3 = driver.findElement(By.xpath("(//label[text()='21-40 Years'])")).isSelected();
	 System.out.println(selected3);
	 if(selected3==false) {
		 System.out.println("Hence verified");
	 }
	 else {
		 System.out.println("operation failed");
	 }
	 driver.close();

	}

}
