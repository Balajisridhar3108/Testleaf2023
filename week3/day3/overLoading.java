package week3.day3;

public class overLoading {
	public void reportStep(String msg , String status) {
		System.out.println("This is message " + msg);
		System.out.println("This is status " + status);
	}
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("This is another msg " + msg);
		System.out.println("This is  status " + status);
		System.out.println("This is a snap " + snap);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overLoading obj = new overLoading();
		obj.reportStep("Hi", "pass");
		obj.reportStep("Hey", "Fail", false);
		

	}

}
