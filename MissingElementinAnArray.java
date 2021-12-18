package week3.day2Assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingElementinAnArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
	
		Set<Integer> num = new LinkedHashSet <Integer>();
		/*
		 * num.add(1); num.add(2); num.add(3); num.add(4); num.add(7); num.add(6);
		 * num.add(8);
		 */
		for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
	        num.add(i);
	    }

	    for (int i = 0; i < arr.length; i++) {
	        num.remove(arr[i]);
	    }

	    for (int x : num) {
	        System.out.print(x + " ");
	    }			
		
			
	

	}

}