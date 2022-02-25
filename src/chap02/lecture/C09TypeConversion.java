package chap02.lecture;

public class C09TypeConversion {

	public static void main(String[] args) {
		
		byte b1 = 120;
		short s1 = 30000;
		int i1 = 2100000000;
		long l1 = 4200000000L;
		
		byte b2;
		short s2;
		int i2;
		long l2;
		
		b2 = b1;		// 문제 없음 
		System.out.println(b2);
		s2 = b1;		// 문제 없음 
		System.out.println(s2);
		i2 = b1;		// 문제 없음 
		System.out.println(i2);
		l2 = b1;		// 문제 없음 
		System.out.println(l2);
		
		// b2 = s1		// x
		b2 = (byte) s1; // 안되지만 강제로 타입 변환 (type casting)
		System.out.println(b2);		// 강제 형변환인 경우 값이 사라질 수 있기 때문에 감안 해야한다. 
		s2 = s1;
		System.out.println(s2);
		i2 = s1;
		System.out.println(i2);
		l2 = s1;
		System.out.println(l2);
		
		b2 = (byte) i1;	// 강제 형변환 
		System.out.println(b2);
		s2 = (short) i1; // 강제 형변환
		System.out.println(s2);
		i2 = i1;	// 문제 없음 
		System.out.println(i2);	
		l2 = i1;	// 문제 없음 
		System.out.println(l2);
		
		b2 = (byte) l1; // 강제 형변환
		System.out.println(b2);
		s2 = (short) l1; // 강제 형변환
		System.out.println(s2);
		i2 = (int)l1; // 강제 형변환
		System.out.println(i2);
		l2 = l1; // 문제 없음 
		System.out.println(l2);
		
		
		// char -> int
		// char -> long
		
		char c1 = '가';
		i2 = c1;
		System.out.println(i2);		// 우리 눈엔 글자로 보이지만 숫자로 해석해서 정수형으로 변환 가능하다. 
		l2 = c1;
		System.out.println(l2);		// 우리 눈엔 글자로 보이지만 숫자로 해석해서 정수형으로 변환 가능하다. 
		
		
	}

}
