package chap03.lecture.binary;

public class C02Arithmetic {

	public static void main(String[] args) {
		
		// 정수 연산시 주의 할 점. 
		
		int n1 = 2000000000;
		int n2 = 1000000000;
		
		System.out.println(n1 + n2);	// overflow(범위 값을 초과)
										// 결과가 제대로 안나옴 
		
		int n3 = -2000000000;
		int n4 = -1000000000;
		
		System.out.println(n3 + n4);	// underflow(범위 값 미만) 
										// 결과가 제대로 안나옴 
		
		long n7 = -2000000000;
		long n8 = -1000000000;
		System.out.println(n7 + n8);	// long을 써서 결과가 제대로 나온다. 
	}									 

}
