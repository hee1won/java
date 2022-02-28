package chap03.exercise;

public class Exercise07 {

	public static void main(String[] args) {
		
		// 비교연산자와 논리연산자의 복합연산을 이용해 출력 결과 구하기
		
		int x = 10;
		int y = 5;
		
		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));
	}

}
