package polymorphism;

//methord resulation always take care by jvm based on run time object
//hence it is colled run time polymorphism
//
class Parent {
	public void marriage() {
		System.out.println("parent likes: sushmita is good");
	}

	public void property() {
		System.out.println("parent property");
	}
}

class Child extends Parent {
	public void marriage() {
		System.out.println(" child likes :rashmita is good");
	}

	public void ChildProperty() {
		System.out.println("child property");
	}

}
public class Overridding {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.marriage();

		Child c = new Child();
		c.marriage();

		Parent p1 = new Child();
		p1.marriage();
		p1.property();

	}

}
