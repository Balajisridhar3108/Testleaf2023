package week3.day3;

public class overRiding2 extends overRiding1 {
	public void MethodOverRiding(String msg) {
		System.out.println("This is a overriding method " + msg);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overRiding2 obj = new overRiding2() ;
		obj.MethodOverRiding("For Learing");	
		

		
		}
}