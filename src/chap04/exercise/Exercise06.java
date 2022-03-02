package chap04.exercise;

public class Exercise06 {

	public static void main(String[] args) {
		
		// 예제6 *로 삼각형 만들기 
		
		String star = "*";
		for(int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*";
		}
		
		System.out.println("출력 (끝에 enter없이)");
		// print
		System.out.print("출력1 ");
		System.out.print("출력2 ");
		System.out.println();		// 다음 줄 
		System.out.print("출력3 ");
		System.out.print("출력4 ");
		System.out.println();
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
