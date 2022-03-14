package chap06.exercise.p19;

public class Account {
	
	public static final int MIN_BALACE = 0;
	public static final int MAX_BALACE = 1000000;
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance >= MIN_BALACE && balance <= MAX_BALACE) {
			this.balance = balance;
		}
	}

}
