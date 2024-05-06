package stringQuestionCollection;

import java.util.HashMap;
import java.util.Map;

public class OccureneceOfEachCharInString {

	public static void main(String[] args) {
		
		String s = "shubhamsaurabh";
		
		Map<Character, Integer> occurence = new HashMap<>();
		
		char[] chars = s.toCharArray();
		
		for(char c :chars) {
			if(!occurence.containsKey(c)) {
				occurence.put(c,1);
			}
			
			else {
				int i = occurence.get(c);
				occurence.put(c, i+1);
				
			}
			
		}
		
		System.out.println(occurence);
		
		

	}

}
