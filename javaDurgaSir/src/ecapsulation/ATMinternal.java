package ecapsulation;

import java.util.Scanner;

public class ATMinternal {

	private int balance;
	private int accNo = 4567890;
	private int pass = 4567890;

	Scanner sc = new Scanner(System.in);

	public void setBalance(int balance) {

		this.balance = balance;

	}

	public int getBalance() {
		// validation
		System.out.println("enter account no");
		int userAccNo = sc.nextInt();
		if (userAccNo == accNo) {
			System.out.println("enter password");
			int userPass = sc.nextInt();
			if (userPass == pass) {
				System.out.println("avilable balance :-"+balance);
			}

		}

		return balance;
	}

}
