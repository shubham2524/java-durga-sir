package stringQuestionCollection;

public class createStringFromChar {

	public static void main(String[] args) {
		
		String s = "shubhamsurabh";
		
		String snew = "";
		
		for(int i = 0 ;i<s.length();i++) {
			snew += s.charAt(i);
			
		}
		System.out.println(snew);

	}

}
