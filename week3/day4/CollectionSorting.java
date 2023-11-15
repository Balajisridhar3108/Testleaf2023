package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] S = {"HCL, Wipro, Aspire Systems, CTS"};
		
		List<String> obj = new ArrayList<String>();
		obj.add("HCL");
		obj.add("Wipro");
		obj.add("Aspire Systems");
		obj.add("CTS");
		
		Collections.sort(obj);
		System.out.println(obj);
		
		int b = obj.size()-1;
		System.out.println(b);
		
		for (int i = b; i>=0; i--) {
			System.out.println(obj.get(i));
			
		}
		
			
		}
		
		
		

	}


