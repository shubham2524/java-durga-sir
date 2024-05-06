package stringConcept;
//all changes made in same object no new object is created.

//it is muttable
public class stringBufferConcept {

	public static void main(String[] args) {
		// constructor 1
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		//to add element 
		
		sb.append("345678sdfghjiuytrd");
		//new capacity = (old capacity +1 )*2 -> 17*2 = 34
		System.out.println(sb.capacity());
		
		
		
		//constructor -2
		StringBuffer sb1 = new StringBuffer(1000);
		System.out.println(sb1.capacity());
		
		
		//constructor -3
		//new capacity = 16+string length
		StringBuffer sb2 = new StringBuffer("shubham");
		System.out.println(sb2.capacity());
		
		//methord
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb2.charAt(2));
		
		sb2.setCharAt(2,'v');
		System.out.println(sb2);;
		
		sb2.append("saurabh");
		sb2.append(false);
		System.out.println(sb2);
		
		sb2.insert(14,'@');
		System.out.println(sb2);
		
		sb2.delete(15, 20);
		System.out.println(sb2);
		
		sb2.deleteCharAt(14);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
		sb2.reverse();
		
		
		sb2.setLength(10);
		System.out.println(sb2);
		System.out.println(sb2.length());
		
		System.out.println(sb2.capacity());
		
		sb2.ensureCapacity(30);
		System.out.println(sb2.capacity());
		
		sb2.trimToSize();
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		
	}

}
