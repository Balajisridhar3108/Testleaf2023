package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,10,6,8} ;
	
		
		List<Integer> b = new ArrayList<Integer>();
		for (int integer : a) {
			b.add(integer);
			
		}
		
		//System.out.println(b);
		
		Collections.sort(b);
		
		System.out.println(b);
		
		
		  int size = b.size(); 
		  //System.out.println(size);
		 
		
		for (int i = 0; i<size ; i++) {
			 if (i+1 != a[i]) {
				 System.out.println(i+1);
				
			}
				
			}
			
	}


					
	}

				
			
			
			
		
		
			
		
	


