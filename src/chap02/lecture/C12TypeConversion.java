package chap02.lecture;

public class C12TypeConversion {
	public static void main(String[] args) {
		// 정수끼리 연산
		
		int i1 = 30;
		int i2 = 20;
		
		int i3 = i1 + i2;
		System.out.println(i1 + i2);
		System.out.println(i3);
		
		// 정수끼리 연산(byte, short, int(long은 x) -> 결과 : int
		
		byte b1 = 3;
		byte b2 = 4;
//		byte b3 = b1 + b2;			// 연산 결과가 int로 나오므로 형 변환을 해줘야 한다
		byte b3 = (byte) (b1 + b2);
		System.out.println(b1 + b2);
		System.out.println(b3);
		
		
		short s1 = 1000;
		short s2 = 2000;
//		short s3 = s1 + s2;			// 연산 결과는 int이므로 형 변환
		short s3 = (short) (s1 + s2);
		int i4 = s1 + s2;			// 가능
		
		System.out.println(s3);
		System.out.println(i4);
		
		long l1 = 200000000;
		long l2 = 100000000;
		long l3 = l1 + l2;
		System.out.println(l3);
		
		// 서로 다른 타입끼리 연산시 연산결과 : 큰 타입
		
		long l4 = 10000000;
		int i5 = 10000000;
		
		
		int i6 = (int)(l4 + i5);	// 형 변환 필수 
		long l5 = l4 + i5;			// 형 변환 안해도 가능 
		
		System.out.println(l5);
		System.out.println(i6);
		
		// 각 타입의 최소값 최대값
		// byte
		System.out.println(Byte.MAX_VALUE);		// byte의 최대값 
		System.out.println(Byte.MIN_VALUE);		// byte의 최소값 
		
		//short
		System.out.println(Short.MAX_VALUE);	// short의 최대값
		System.out.println(Short.MIN_VALUE);	// short의 최소값
		
		// int
		System.out.println(Integer.MAX_VALUE);	// int의 최대값
		System.out.println(Integer.MIN_VALUE);	// int의 최소값
		
		// long
		System.out.println(Long.MAX_VALUE);		// long의 최대값
		System.out.println(Long.MIN_VALUE);		// long의 최소값
		
		// 실수
		// float
		System.out.println(Float.MAX_VALUE);	// float의 최대값
		System.out.println(Float.MIN_VALUE);	// float의 최소값
		System.out.println(- Float.MAX_VALUE);	// -float의 최대값(음수의 최대값)
		System.out.println(- Float.MIN_VALUE);	// -float의 최소값(음수의 최소값)
		
		// double
		System.out.println(Double.MAX_VALUE);	// double의 최대값 
		System.out.println(Double.MIN_VALUE);	// double의 최소값 
		System.out.println(- Double.MAX_VALUE);	// -double의 최대값 (음수의 최대값)
		System.out.println(- Double.MAX_VALUE); // -double의 최소값 (음수의 최소값)
	}

}
