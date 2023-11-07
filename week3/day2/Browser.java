package week3.day2;

public class Browser extends chrome{
	String s = "chromeBrowser";
	int  version = 15;
	
	public void openURL() {
		System.out.println("openURL");
	}
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	public void navigateBack() {
		System.out.println("navigateBack");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Browser obj = new Browser();
		obj.openURL();
		obj.closeBrowser();
		obj.navigateBack();
		obj.openIncognito();
		obj.clearCache();
		obj.takeSnap();
		obj.clearCache();
		obj.readerMode();
		obj.fullScreenMode();

	}

}
