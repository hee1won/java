package chap04.book;

public class B06ForMultiplicationTableExample {

	public static void main(String[] args) {

		// 구구단 예제
		// 2단부터 9단까지 

		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단" + " ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		// 9단부터 2단까지
		
		for (int a = 9; a >= 2; a--) {
			System.out.println("*** " + a + "단" + " ***");
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + " X " +  b + " = " + (a*b));
			}
		}
		
		// 9 x 9 = 81 ~~~ 2 x 1 = 2 까지 거꾸로 
		
		for(int c = 9; c >=2; c--) {
			System.out.println("*** " + c + "단" + " ***");
			for ( int d = 9; d >= 1; d--) {
				System.out.println(c + " X " + d + " = " + (c*d));
			}
		}
	}

}
