package chap06.book.s060804;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		// 정사각형의 넓이 구하기 
		double result1 = c1.areaRectangle(10);
		System.out.println("정사각형의 넓이 : " + result1);
		
		// 직사각형의 넓이 구하기 
		double result2 = c1.areaRectangle(10, 20);
		System.out.println("직사각형의 넓이 : " + result2);

	}

}
