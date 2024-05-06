package polymorphism;
//in overloading mehtod resulation aways takes care by comiler, based on refrance type hence it 
//also known as copile time polymorphism. 
//same name but different method Arguments  
public class Overloading {

	public void m1(int a) {
		System.out.println("m1 method with int Arguments");
	}

	public void m1(String s) {
		System.out.println("m1 method with String Argument");
		

	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.m1(2);
		o.m1('s');//overloading promotion
		o.m1("shubham");
		//o.m1(10.5);

	}

}
