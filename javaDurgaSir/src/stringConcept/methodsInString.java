package stringConcept;

public class methodsInString {

	public static void main(String[] args) {
		
		String s = " shubham";
		
		//charAt()
		System.out.println(s.charAt(0));
		
		//concat()
		 s.concat(" saurabh");
		System.out.println(s);
		
		
		//equals()
		// to check contennt
		String s1  ="shubham";
		System.out.println(s.equals(s1));
		System.out.println(s.equals("shubham"));
		
		
		//equalsIgnoreCase()
		System.out.println(s.equalsIgnoreCase("SHUBHAM"));
		
		//isempty()
		System.out.println(s.isEmpty());
		
		//length()
		System.out.println(s.length());
		
		
		//replace()
		String s6 = s.replace('a', 'b');
		System.out.println(s6);
		System.out.println(s);
		
		//substring()
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 4));
		
		
		//indexOf()
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('z'));
		System.out.println(s.lastIndexOf('h'));
		
		//toLowerCase()
		System.out.println(s.toLowerCase());
		
		//toUpperCase()
		System.out.println(s.toUpperCase());
		
		//trim()
		//remove blank space from begning and last of the string
		System.out.println(s.trim());
		
		//immutable
		//if we want to make any changes then a new object et created outherwise same object will be re used
		
		String s9 = s.toLowerCase();
		System.out.println(s==s9);
		
		String s8 = s.toUpperCase();
		System.out.println(s==s8);
		// best example of immutability 
		System.out.println(s);
		
		

	}

}
