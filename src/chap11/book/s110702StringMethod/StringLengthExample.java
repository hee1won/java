package chap11.book.s110702StringMethod;

public class StringLengthExample {
	public static void main(String[] args) {
		
		String ssn = "73019855";
		int length = ssn.length();
		if (length == 8) {
			System.out.println("군번 자리수가 맞습니다.");
		} else {
			System.out.println("군번 자리수가 틀립니다.");
		}
		
	}

}
