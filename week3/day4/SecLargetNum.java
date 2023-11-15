package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecLargetNum {

	public static void main(String[] args) {

		List<Integer> SecLargeNum = new ArrayList<Integer>();
		SecLargeNum.add(3);
		SecLargeNum.add(2);
		SecLargeNum.add(11);
		SecLargeNum.add(4);
		SecLargeNum.add(6);
		SecLargeNum.add(7);
		
		Collections.sort(SecLargeNum);
		System.out.println(SecLargeNum.get(4));
	}

}
