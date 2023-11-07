package week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUserName() {
		System.out.println("enterUserName");
	}
	
	public void enterPassword() {
		System.out.println("enterPassword");
	}

	public static void main(String[] args) {
		LoginTestData obj = new LoginTestData() ;
		obj.enterUserName();
		obj.enterPassword();
		obj.enterCredential();
		obj.naviateToHomepage();
			
		
	}
}
