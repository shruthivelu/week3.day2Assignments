package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int arr1 [] = {3,2,11,4,6,7};
		int arr2 [] = {1,2,8,4,9,7};
		int result;
		
		ArrayList<Integer>num = new ArrayList<Integer>();		
		
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		
		ArrayList<Integer>num1 = new ArrayList<Integer>();
		
		num1.add(1);
		num1.add(2);
		num1.add(8);
		num1.add(4);
		num1.add(9);
		num1.add(7);
		
		num.retainAll(num1);
		System.out.println(num);
		
		/*
		 * for (int i = 0; i < arr1.length; i++) {
		 * 
		 * for (Integer integer : num ) { if (num1.contains(integer)) {
		 * num.add(integer);
		 * 
		 * } System.out.println(num); }
		 * 
		 * }
		 */
		 
		

	}

}