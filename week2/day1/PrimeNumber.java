package week2.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 13 ;
		int count = 0 ;
		
		for (int i = 1; i<=num; i++) {
			if(num%i ==0) {
				count++;
			//System.out.println(i);	
			}
		}
        
		if(count ==2) {
			System.out.println("The given number is prime number");
		}else {
			System.out.println("The given number is not a prime number");
		}
	}
}

