package ecapsulation;
//the process of winding data with codes in a single unit is colled encapsulation.
//security
//it is combination of data hidding and abstraction.
//for tightly encapsulated class ---make each and every variables as private
 
//by using etter and seeter methord we can access that variable

public class ATMuserInterface  {

	public static void main(String[] args) {
		ATMinternal atmi = new ATMinternal();
		atmi.setBalance(56789);
		atmi.getBalance();

	}

}
