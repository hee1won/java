package chap02.book02;

public class B10CastingExample {

	public static void main(String[] args) {
		
		// 강제 타입 변환 Example
		// 크기가 큰 크기에서 작은 크기로 넘어갈 때 
		// 앞에 낮은 크기의 타입을 괄호 안에 적는다.
		
		int intValue = 44032;
		char charValue = (char) intValue;	// 큰 바이트에서 낮은 바이트로 강제 형 변환 ( 값이 제대로 안나올 수 있다.)
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;		// 큰 크기에서 낮은 크기로 강제 형 변환 ( 정수형 )
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;	// 큰 실수형에서 낮은 정수형으로 강제 형 변환 ( 실수 -> 정수형 )
		System.out.println(intValue);	// 정수형이므로 소수점 자리는 나오지 않는다.

	}

}
