package stringConcept;

final class ImmutabalityClass {
	
	private int i ;

	public ImmutabalityClass(int i) {
		this.i = i;
		
	}
	public ImmutabalityClass modify(int i) {
		if(this.i == i) {
			return this;
		}
		else  {
			return new ImmutabalityClass(i);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		ImmutabalityClass ic = new ImmutabalityClass(10);
		ic.modify(100);
		ic.modify(10);
		
	}

}
