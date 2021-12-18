package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		ArrayList<Integer>num=new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
				
//		num.add(14);
//		num.add(12);
//		num.add(13);
//		num.add(11);
//		num.add(15);
//		num.add(14);
//		num.add(18);
//		num.add(16);
//		num.add(17);
//		num.add(19);
//		num.add(18);
//		num.add(17);
//		num.add(20);
		
		Set<Integer>s = new HashSet<Integer>();
		
		for (Integer dup : num) {
			if (s.add(dup)==false) {
				System.out.println(dup);
				
			}
			
		}	
		

	}

}
