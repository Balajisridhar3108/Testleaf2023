package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Google {

	public static void main(String[] args) {
		 String CompanyName = "GOOGLE";
		 String[] S = CompanyName.split("");
		 
		 Set<String> obj = new LinkedHashSet<String>();
		 for (String string : S) {
			obj.add(string);
			
		}
		 System.out.println(obj);
		

	}

}
