package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "madam";
		String s2 ="";
		
		for (int i=s.length()-1; i>=0; i--) {
			s2 = s2 + s.charAt(i);
	}
        System.out.println(s2);
		if(s2.equals(s)) {
			System.out.println("it's a palindrome");
		}
		else
			System.out.println("it's not a palindrome");
}
}
