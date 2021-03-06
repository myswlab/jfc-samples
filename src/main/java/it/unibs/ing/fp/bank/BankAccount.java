package it.unibs.ing.fp.bank;


public class BankAccount {
	private long balance;
	
	public BankAccount(long initialBalance) {
		this.balance = initialBalance;
	}
	
	public BankAccount() {
		this(0);
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(long depositAmount) {
		balance += depositAmount;
	}

	public long withdraw(long withdrawAmount) {
		if(withdrawAmount <= balance) {
			balance -= withdrawAmount;
			return withdrawAmount;
		} else {
			long available = balance;
			balance = 0;
			return available;
		}
	}
}
