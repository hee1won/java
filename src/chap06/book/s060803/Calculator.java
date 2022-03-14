package chap06.book.s060803;

public class Calculator {
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int a, int b) {
		double sum = plus(a, b);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
