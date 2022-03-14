package chap06.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
		
		// final : 변수 선언시 값을 한번 할당할 기회 
		int i = 0;
		i = 3;
		
		final int j = 0;
//		j = 2; // x
		
		final int k;
		k = 9;
//		k = 10; // x
		
		method1(3);		// 3
		method1(10);	// 10
		
		
	}
	
	public static void method1(final int i) {
//		i = 30;		// xx
		
	}

}
