package chap10.lecture.p01exception;

public class App05 {
	public static void main(String[] args) {
		// ArithmeticException
		
		int i = 5;
		int j = 0;
		
		System.out.println(i / j);	// ArithmeticException 0으로 나눌때 발생 
		
		// 이건 가능 
		if (j != 0) {
			System.out.println(i / j);
		}
		
		System.out.println("프로그램 계속 실행");
		
	}

}
