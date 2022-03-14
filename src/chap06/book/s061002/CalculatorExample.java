package chap06.book.s061002;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.x);
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result 1 : " + result1);
		System.out.println("result 2 : " + result2);
		System.out.println("result 3 : " + result3);

	}

}
