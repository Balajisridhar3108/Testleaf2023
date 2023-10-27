package week1.day1;

public class Mobile {

	public void makeCall() {
		String MobileModel = "iPhone" ;
		System.out.println(MobileModel);
		float mobileweight = 121.4f ;
		System.out.println(mobileweight);
		
		
		
	}
	public void sendMsg() {
		boolean isFullCharged = false ;
		System.out.println(isFullCharged);
	    int mobileCost = 120000 ;
	    System.out.println(mobileCost);
	    
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my Mobile");
		
	}
}

//output : iphone, 121.4, false, 120000