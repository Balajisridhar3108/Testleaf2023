package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTC_001  extends ProjectSpecificMethod{

	@Test
	public void runlogin() {
		LoginPage lp = new LoginPage() ;
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		
		
		
		
		
		
		
			
		
	

}
}
