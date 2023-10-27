package week1.day1;

public class Browser {

	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched succesfully");
		
		return browserName ;
			
		}

	public void LoadUrl() {
      System.out.println("Application url loaded successfully");
      
		
	}
     public static void main(String[] args) {
    	 Browser obj = new Browser() ;
    	 obj.launchBrowser("Chrome");
    	 obj.LoadUrl();
    	 	 // Take a look into EdgeBrowser
     }
}
