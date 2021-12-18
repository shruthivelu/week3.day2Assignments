package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import cucumber.api.cli.Main;

public class RemoveDuplicates {

	public static void main(String[] args) {			
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		ArrayList<String> val = new ArrayList<String>(Arrays.asList(split));
		
		
		Set<String>str = new LinkedHashSet<String>(val);
		
//		for (int i = 0; i < text.length(); i++) {
//			val.contains(text.toCharArray());
//			
//		}
		
		
		for (String word :split) {
			str.add(word);
			
			}
		String string = str.toString();
		System.out.println(string.replace(",", " "));
		}
		
//		for (String dup : val) {
//			if (str.equals(dup)==false) {
//				System.out.println(dup);
//				
//			}
//			else {
//				System.out.println("Unable to Duplicate");
//			}
//			
//		}	
				
		
		
	} 
		
		
		
		
	


