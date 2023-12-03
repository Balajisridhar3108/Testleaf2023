package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginLogoutTC_002 extends ProjectSpecificMethod{
	
	@Test
	public void runLogOut() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton();
		
		
	}

}
