package chap02.book02;

public class B09PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;	// byte -> int ( 작은크기에서 큰 크기로 형 변환 )
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue; 		// char -> int ( '가'의 유니코드로 형 변환 )
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue; 	// int -> long ( 작은 크기에서 큰 크기로 형 변환 )
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // int -> double ( 정수에서 실수형으로 형 변환 )
		System.out.println(doubleValue);
	}

}
