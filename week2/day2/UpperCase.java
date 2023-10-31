package week2.day2;

public class UpperCase {

	public static void main(String[] args) {
		String s = "changeme";
		char[] charArray = s.toCharArray();
		
		for (int i = 1; i < charArray.length; i=i+2) {
			charArray[i] = Character.toUpperCase(charArray[i]);
			
			
		}
System.out.println(charArray);
	}

}
