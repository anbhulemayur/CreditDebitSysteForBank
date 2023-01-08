package CreditDebitSystem;

public interface Bank {

	int currentBalance();

	int addMoney(int amount);

	int withdrawMoney(int amount);
}
