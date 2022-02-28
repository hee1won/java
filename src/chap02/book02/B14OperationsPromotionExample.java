package chap02.book02;

public class B14OperationsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;  <- 정수 + 정수값은 int로 결과가 나옴 
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;	<- 마찬가지로 char도 정수로 포함되기때문에 int로 바꿔줘야 함 
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0		<- 정수랑 실수 계산은 더 큰 크기 double로 나옴
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

	}

}
