package CreditDebitSystem;

import java.util.Scanner;

public class Account implements Bank {

	int balance = 100000;

	@Override
	public int currentBalance() {

		return balance;
	}

	@Override
	public int addMoney(int amount) {
		// TODO Auto-generated method stub
		if (amount > 0 && amount % 1 == 0) {
			balance += amount;
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int withdrawMoney(int amount) {
		// TODO Auto-generated method stub
		if (amount <= balance) {
			balance -= amount;
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String a[]) {
		Account s = new Account();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("**********************ATM***************************");
			System.out.println("1.see current balance");
			System.out.println("2.withdra money");
			System.out.println("3.add balance");
			System.out.println("4.Exit");
			System.out.println("****************************************************");
			System.out.println("Enter choice-->");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Your Current Balance-->" + s.currentBalance());
				break;

			case 2:
				System.out.println("Enter amount for withdraw-->");
				int amount = sc.nextInt();
				int amt = s.withdrawMoney(amount);
				if (amt == 1) {
					System.out.println("Cash Recieved..!");
				} else {
					System.out.println("Insufficient Balance..!");
				}
				break;

			case 3:
				System.out.println("Enter money for deposite-->");
				int money = sc.nextInt();
				int dep = s.addMoney(money);
				if (dep == 1) {
					System.out.println("Amount deposite Successfully..!");
				} else {
					System.out.println("Enter valid amount..!");
				}
				break;
			case 4:
				System.out.println("You are log out..!");
				System.exit(0);
			}
		}
	}
}

