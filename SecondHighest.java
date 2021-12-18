package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondHighest {

	public static void main(String[] args) {
		String str="PayPal India";
		char[] ch = str.toCharArray();				
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();		
		
		
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i],0)+1);
			
		}
		System.out.println(map);
		
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		System.out.println(list);
		
		Integer sl = list.get(list.size()-2); 
	      System.out.println(sl);
	      System.out.println("Second Largest " +sl);
	      for(Entry<Character, Integer> entry: map.entrySet()) {
	          if(entry.getValue() == sl) {
	            System.out.println("The key for value " + sl + " is " + entry.getKey());
	   }
	      
	    
	
	      }
		 	
		

	}

}
