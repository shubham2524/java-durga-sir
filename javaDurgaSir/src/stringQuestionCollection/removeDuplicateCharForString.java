package stringQuestionCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharForString {

	public static void main(String[] args) {

		String s = "shubhamsaurabh";
		// output: shubamr
		// Approch -1
		Set<Character> s1 = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			s1.add(s.charAt(i));
		}
		System.out.println(s1);

		StringBuilder sb = new StringBuilder();
		for (Character c : s1) {
			sb.append(c);
		}
		System.out.println(sb);

		// Approch -2
		
		String news = "";
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			int j = news.indexOf(c);
			if(j==-1) {
				news += c;
				
			}
		}
		System.out.println(news);

	}

}
