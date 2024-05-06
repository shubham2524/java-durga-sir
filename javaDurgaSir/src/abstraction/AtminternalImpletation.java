package abstraction;

public class AtminternalImpletation extends AtmuserInterface  {
	
	int AvilBal = 23456;

	@Override
	void checkBalance() {
		System.out.println("AvilableBlaance :-"+AvilBal);
		
		
	}

	@Override
	void withdrawal(int a) {
		this.AvilBal  =AvilBal-a;
		System.out.println("remaining balance :-"+AvilBal);
	}

	@Override
	void deposite(int a) {
		this.AvilBal = AvilBal+a;
		System.out.println("updated balance :-"+AvilBal);
	}

	
	
	

}
