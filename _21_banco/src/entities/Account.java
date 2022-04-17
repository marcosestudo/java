package entities;

public class Account {

	private int accNumber;
	private String holderName;
	private double balance;

	public Account(int accNumber, String holderName, double initialDeposity) {
		this.accNumber = accNumber;
		this.holderName = holderName;
		deposit(initialDeposity);
	}

	public Account(int accNumber, String holderName) {
		this.accNumber = accNumber;
		this.holderName = holderName;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value + 5.0; // é cobrada uma taxa de $5 por depósito
	}

	public String toString() {
		return "Account: " +
		accNumber +
		", Holder: " +
		holderName +
		", Balance: $" +
		String.format("%.2f", balance);
	}

}
