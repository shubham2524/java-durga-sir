package inheritance;
//it is process of inherit all the properties and behaviour of parent class to chld class.
//reusability of codes 
//does not support multiple inheritence  ambiguity problem
//does not support cyclic inheritence
public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.ParentProperty();
		
		Child c = new Child();
		c.ParentProperty();
		c.Childproperty();
		
		Parent p1 = new Child();
		p1.ParentProperty();
		
		
		//Child c1 = new Parent();--not valid
		
		
		

	}

}
