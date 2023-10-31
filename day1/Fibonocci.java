package week2.day1;

public class Fibonocci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		
		for (int i = 0; i <8; i++) {
			int thirdNum = firstNum + secondNum ;
			firstNum = secondNum;
			secondNum = thirdNum;
			
			System.out.println(firstNum);
		}

	}

}
