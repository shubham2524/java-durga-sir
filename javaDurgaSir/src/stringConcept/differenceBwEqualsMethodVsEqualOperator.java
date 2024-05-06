package stringConcept;

public class differenceBwEqualsMethodVsEqualOperator {

	public static void main(String[] args) {
		String s = "shubham";
		String s1 = "shubham";
		
		
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		String s2 = new String("saurabh");
		String s3 = new String("saurabh");
		//== operator always used for object refrance comparision 
		
		System.out.println(s2 == s3);
		
		//.equal method always used for content comparision in string class 
		
		System.out.println(s2.equals(s3));
		
		
		
		
		
		
		

	}

}
