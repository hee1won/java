package chap10.book.s1008;

import chap10.book.s100701.BalanceInsufficientException;
import chap10.book.s100702.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기 
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 출금하기 
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
