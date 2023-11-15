package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		
		
		List<Integer> Arrayint = new ArrayList<Integer>();
		Arrayint.add(3);
		Arrayint.add(2);
		Arrayint.add(11);
		Arrayint.add(4);
		Arrayint.add(6);
		Arrayint.add(7);
		
		List<Integer> Arrayint2 = new ArrayList<Integer>();
		Arrayint2.add(1);
		Arrayint2.add(2);
		Arrayint2.add(8);
		Arrayint2.add(4);
		Arrayint2.add(9);
		Arrayint2.add(7);
		
		for (int i = 0; i <Arrayint.size(); i++) {
			for (int j = 0; j < Arrayint2.size(); j++) {
				if(Arrayint.get(i)==Arrayint2.get(j)) {
					System.out.println(Arrayint.get(i));
				}
				
			}
			
		}
		
	}

}
