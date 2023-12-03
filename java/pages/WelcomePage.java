package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

		public MyHomePage clickCrmsfaLink() {
			driver.findElement(By.linkText("CRM/SFA")).click();
			return new MyHomePage();
		}
		
		public LoginPage clickLogoutButton() {
			System.out.println("LogOut Successfull");
			return new LoginPage();
			
		}
		public WelcomePage VerifyLoginPage() {
			System.out.println("VerifyLogin");
			return this ;
		
	}

}
