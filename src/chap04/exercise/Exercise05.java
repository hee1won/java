package chap04.exercise;

public class Exercise05 {

	public static void main(String[] args) {
		
		
		// 예제5 방정식 4x + 5y = 60의 모든 해를 구해라.
		// 1 <= x,y <= 10
		
		for ( int x = 1; x <= 10; x++) {
			
			for (int y = 1; y <= 10; y++) {
				
				if((4 * x) + (5 * y) == 60) {
				System.out.println("X: " + x + ", Y:" + y);
				}
			}
		}

	}

}
