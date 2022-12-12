package entities;

public class Bank {
	private int number;
	private String holder;
	private double balance;
	
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Bank(int acnumber, String holder, double initialDeposit) {
		this.number = acnumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: "
				+ number 
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ balance;
	}
}


