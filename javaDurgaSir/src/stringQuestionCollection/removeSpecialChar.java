package stringQuestionCollection;

public class removeSpecialChar {

	public static void main(String[] args) {
		
		String s  = "shuis%^@&";
		
		String snew = s.replaceAll("[^A-Za-z0-9]","");
		
		System.out.println(snew);
		
		
	}

}
